package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class User  extends AbstractModel{


    /**
    * app_id
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 用户类型（1：国内，2：国际）
    */
    @SerializedName("Area")
    @Expose
    private Integer Area;

    /**
    * 计费类型（日结、月结）
    */
    @SerializedName("BillingType")
    @Expose
    private String BillingType;

    /**
    * 用户状态（0：正常，1：欠费，2：恶意）
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 备注信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * 获取app_id
     * @return AppId app_id
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置app_id
     * @param AppId app_id
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取用户类型（1：国内，2：国际）
     * @return Area 用户类型（1：国内，2：国际）
     */
    public Integer getArea() {
        return this.Area;
    }

    /**
     * 设置用户类型（1：国内，2：国际）
     * @param Area 用户类型（1：国内，2：国际）
     */
    public void setArea(Integer Area) {
        this.Area = Area;
    }

    /**
     * 获取计费类型（日结、月结）
     * @return BillingType 计费类型（日结、月结）
     */
    public String getBillingType() {
        return this.BillingType;
    }

    /**
     * 设置计费类型（日结、月结）
     * @param BillingType 计费类型（日结、月结）
     */
    public void setBillingType(String BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * 获取用户状态（0：正常，1：欠费，2：恶意）
     * @return Status 用户状态（0：正常，1：欠费，2：恶意）
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置用户状态（0：正常，1：欠费，2：恶意）
     * @param Status 用户状态（0：正常，1：欠费，2：恶意）
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取备注信息
     * @return Message 备注信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置备注信息
     * @param Message 备注信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取修改时间
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

