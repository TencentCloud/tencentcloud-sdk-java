package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Authentication  extends AbstractModel{


    /**
    * 授权场景，例如COS
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;
    

    /**
    * SecretId
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;
    

    /**
    * SecretKey
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;
    

    /**
     * 获取授权场景，例如COS
     * @return Scene 授权场景，例如COS
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * 设置授权场景，例如COS
     * @param Scene 授权场景，例如COS
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * 获取SecretId
     * @return SecretId SecretId
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * 设置SecretId
     * @param SecretId SecretId
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * 获取SecretKey
     * @return SecretKey SecretKey
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * 设置SecretKey
     * @param SecretKey SecretKey
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

