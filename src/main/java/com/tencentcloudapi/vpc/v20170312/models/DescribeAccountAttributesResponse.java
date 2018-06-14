package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeAccountAttributesResponse  extends AbstractModel{


    /**
    * 用户账号私有属性对象
    */
    @SerializedName("AccountAttributeSet")
    @Expose
    private AccountAttribute [] AccountAttributeSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取用户账号私有属性对象
     * @return AccountAttributeSet 用户账号私有属性对象
     */
    public AccountAttribute [] getAccountAttributeSet() {
        return this.AccountAttributeSet;
    }

    /**
     * 设置用户账号私有属性对象
     * @param AccountAttributeSet 用户账号私有属性对象
     */
    public void setAccountAttributeSet(AccountAttribute [] AccountAttributeSet) {
        this.AccountAttributeSet = AccountAttributeSet;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccountAttributeSet.", this.AccountAttributeSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

