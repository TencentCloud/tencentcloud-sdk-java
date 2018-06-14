package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyKeyPairAttributeRequest  extends AbstractModel{


    /**
    * 密钥对ID，密钥对ID形如：`skey-xxxxxxxx`。<br><br>可以通过以下方式获取可用的密钥 ID：<br><li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥 ID。<br><li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/9403) ，取返回信息中的 `KeyId` 获取密钥对 ID。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 修改后的密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 修改后的密钥对描述信息。可任意命名，但不得超过60个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * 获取密钥对ID，密钥对ID形如：`skey-xxxxxxxx`。<br><br>可以通过以下方式获取可用的密钥 ID：<br><li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥 ID。<br><li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/9403) ，取返回信息中的 `KeyId` 获取密钥对 ID。
     * @return KeyId 密钥对ID，密钥对ID形如：`skey-xxxxxxxx`。<br><br>可以通过以下方式获取可用的密钥 ID：<br><li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥 ID。<br><li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/9403) ，取返回信息中的 `KeyId` 获取密钥对 ID。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * 设置密钥对ID，密钥对ID形如：`skey-xxxxxxxx`。<br><br>可以通过以下方式获取可用的密钥 ID：<br><li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥 ID。<br><li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/9403) ，取返回信息中的 `KeyId` 获取密钥对 ID。
     * @param KeyId 密钥对ID，密钥对ID形如：`skey-xxxxxxxx`。<br><br>可以通过以下方式获取可用的密钥 ID：<br><li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥 ID。<br><li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/9403) ，取返回信息中的 `KeyId` 获取密钥对 ID。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * 获取修改后的密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     * @return KeyName 修改后的密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * 设置修改后的密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     * @param KeyName 修改后的密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * 获取修改后的密钥对描述信息。可任意命名，但不得超过60个字符。
     * @return Description 修改后的密钥对描述信息。可任意命名，但不得超过60个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置修改后的密钥对描述信息。可任意命名，但不得超过60个字符。
     * @param Description 修改后的密钥对描述信息。可任意命名，但不得超过60个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

