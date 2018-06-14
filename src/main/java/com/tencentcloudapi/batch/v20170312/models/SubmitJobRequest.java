package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SubmitJobRequest  extends AbstractModel{


    /**
    * 作业所提交的位置信息。通过该参数可以指定作业关联CVM所属可用区等信息。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 作业信息
    */
    @SerializedName("Job")
    @Expose
    private Job Job;

    /**
    * 用于保证请求幂等性的字符串。该字符串由用户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * 获取作业所提交的位置信息。通过该参数可以指定作业关联CVM所属可用区等信息。
     * @return Placement 作业所提交的位置信息。通过该参数可以指定作业关联CVM所属可用区等信息。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * 设置作业所提交的位置信息。通过该参数可以指定作业关联CVM所属可用区等信息。
     * @param Placement 作业所提交的位置信息。通过该参数可以指定作业关联CVM所属可用区等信息。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * 获取作业信息
     * @return Job 作业信息
     */
    public Job getJob() {
        return this.Job;
    }

    /**
     * 设置作业信息
     * @param Job 作业信息
     */
    public void setJob(Job Job) {
        this.Job = Job;
    }

    /**
     * 获取用于保证请求幂等性的字符串。该字符串由用户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由用户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * 设置用于保证请求幂等性的字符串。该字符串由用户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由用户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "Job.", this.Job);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

