package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ServiceInfo  extends AbstractModel{


    /**
    * 服务版本，基础版basic,专业版Professional
    */
    @SerializedName("ServiceEdition")
    @Expose
    private String ServiceEdition;

    /**
    * 任务处理完成后的反向通知回调地址,通知为POST请求，post信息{ItemId:"xxxduuyt-ugusg"}
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 提交来源 YYB-应用宝 RDM-rdm MC-控制台 MAC_TOOL-mac工具 WIN_TOOL-window工具
    */
    @SerializedName("SubmitSource")
    @Expose
    private String SubmitSource;

    /**
    * 加固策略编号，如果不传则使用系统默认加固策略。如果指定的plan不存在会返回错误。
    */
    @SerializedName("PlanId")
    @Expose
    private Integer PlanId;

    /**
     * 获取服务版本，基础版basic,专业版Professional
     * @return ServiceEdition 服务版本，基础版basic,专业版Professional
     */
    public String getServiceEdition() {
        return this.ServiceEdition;
    }

    /**
     * 设置服务版本，基础版basic,专业版Professional
     * @param ServiceEdition 服务版本，基础版basic,专业版Professional
     */
    public void setServiceEdition(String ServiceEdition) {
        this.ServiceEdition = ServiceEdition;
    }

    /**
     * 获取任务处理完成后的反向通知回调地址,通知为POST请求，post信息{ItemId:"xxxduuyt-ugusg"}
     * @return CallbackUrl 任务处理完成后的反向通知回调地址,通知为POST请求，post信息{ItemId:"xxxduuyt-ugusg"}
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * 设置任务处理完成后的反向通知回调地址,通知为POST请求，post信息{ItemId:"xxxduuyt-ugusg"}
     * @param CallbackUrl 任务处理完成后的反向通知回调地址,通知为POST请求，post信息{ItemId:"xxxduuyt-ugusg"}
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * 获取提交来源 YYB-应用宝 RDM-rdm MC-控制台 MAC_TOOL-mac工具 WIN_TOOL-window工具
     * @return SubmitSource 提交来源 YYB-应用宝 RDM-rdm MC-控制台 MAC_TOOL-mac工具 WIN_TOOL-window工具
     */
    public String getSubmitSource() {
        return this.SubmitSource;
    }

    /**
     * 设置提交来源 YYB-应用宝 RDM-rdm MC-控制台 MAC_TOOL-mac工具 WIN_TOOL-window工具
     * @param SubmitSource 提交来源 YYB-应用宝 RDM-rdm MC-控制台 MAC_TOOL-mac工具 WIN_TOOL-window工具
     */
    public void setSubmitSource(String SubmitSource) {
        this.SubmitSource = SubmitSource;
    }

    /**
     * 获取加固策略编号，如果不传则使用系统默认加固策略。如果指定的plan不存在会返回错误。
     * @return PlanId 加固策略编号，如果不传则使用系统默认加固策略。如果指定的plan不存在会返回错误。
     */
    public Integer getPlanId() {
        return this.PlanId;
    }

    /**
     * 设置加固策略编号，如果不传则使用系统默认加固策略。如果指定的plan不存在会返回错误。
     * @param PlanId 加固策略编号，如果不传则使用系统默认加固策略。如果指定的plan不存在会返回错误。
     */
    public void setPlanId(Integer PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceEdition", this.ServiceEdition);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "SubmitSource", this.SubmitSource);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);

    }
}

