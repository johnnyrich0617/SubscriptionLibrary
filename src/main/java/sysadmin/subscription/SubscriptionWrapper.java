package sysadmin.subscription;

/**
 * <pre>
 * A wrapper for an External System Subscription data.  This is an 
 * intermediate container used to determine if the reason the requested data is
 * empty or null is either not subscribed or just not available in Sentinel.
 * 
 * Implementing classes must ensure to to set the 'isNotFound" flag properly and
 * and check this flag for determining proper ResponseEntity.
 * </pre>
 * 
 * <pre>
 *  Example:Usage...{@code 
 * 
 *  SentCase kase;
 *      ....
 *  if(kase != null && !kase.isEmpty(){
 *      SubscriptionWrapper<SentCase> caseWrapper = new SubscriptionWrapper<>(kase)
 *      caseWrapper.setNotFound(false);
 *  }}
 * </pre>
 * 
 * @author jhrichardson
 * @param <T>
 */
public class SubscriptionWrapper<T> implements GenericDataWrapper{
    /**
     * The subscribed accessible data for a given subscription
     * of a given external system
     */
    private T accessibleData;
    
    /**
     * <pre>
     * True if, Is the reason there is no accessible data because the requested 
     * data is not available in Sentinel and so an "Object Not Found" will be 
     * returned.
     * 
     * False if, the reason there is no data is because the External System is not
     * subscribed to this data and so a "Not Subscribed" error will be returned
     * </pre>
     */
    private boolean isNotFound;
    
    /**
     * <pre>
     * Create a new Wrapper for a Sentinel External System Subscription
     * the data represents the accessible data that this external system
     * has requested.
     * <ul>
     *  <li> Cases </>
     *  <li> Documents</>
     *  <li> Entities </>
     * </ul>
     * </pre>
     * 
     * @param data the package with subscribed accessible data
     */
    public SubscriptionWrapper(T data){
        this.accessibleData = data;
        this.isNotFound = false;
    }

    /**
     * <pre>
     * Get the data package for this subscription as accessible data for the
     * given External System. Can be...
     *  </pre>
     * <ul>
     *  <li> Cases </>
     *  <li> Documents</>
     *  <li> Entities </>
     * </ul>
     * @return the data package for this subscription
     */
    @Override
    public T get() {
        return this.accessibleData; 
    }
    
    /**
     * Set the isNotFound flag
     * @param notFound
     */
    public void setNotFound(boolean notFound){
        this.isNotFound = notFound;
    }
    
    /**
     * Get the isNotFound flag for this Subscription request
     * @return
     */
    public boolean isNotFound(){
        return this.isNotFound;
    }
}
