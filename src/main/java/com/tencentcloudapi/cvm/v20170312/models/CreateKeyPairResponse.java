package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateKeyPairResponse  extends AbstractModel{


    /**
    * 密钥对信息。
    */
    @SerializedName("KeyPair")
    @Expose
    private KeyPair KeyPair;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取密钥对信息。
     * @return KeyPair 密钥对信息。
     */
    public KeyPair getKeyPair() {
        return this.KeyPair;
    }

    /**
     * 设置密钥对信息。
     * @param KeyPair 密钥对信息。
     */
    public void setKeyPair(KeyPair KeyPair) {
        this.KeyPair = KeyPair;
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
        this.setParamObj(map, prefix + "KeyPair.", this.KeyPair);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

