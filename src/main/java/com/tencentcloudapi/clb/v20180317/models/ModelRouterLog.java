/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelRouterLog extends AbstractModel {

    /**
    * <p>API Key的ID</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>模型</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>所属厂商</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>请求状态</p><p>枚举值：</p><ul><li>failure： 失败</li><li>success： 成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>最大重试次数</p>
    */
    @SerializedName("MaxRetries")
    @Expose
    private Long MaxRetries;

    /**
    * <p>单次请求消耗的总Token数量</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * <p>单次请求输入消耗的Token数量</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>单次请求输出消耗的Token数量</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>请求耗时</p><p>单位：ms</p>
    */
    @SerializedName("RequestDuration")
    @Expose
    private Long RequestDuration;

    /**
    * <p>请求IP</p>
    */
    @SerializedName("RequesterIp")
    @Expose
    private String RequesterIp;

    /**
    * <p>日志查询起始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>日志查询结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>API Key的ID</p> 
     * @return KeyId <p>API Key的ID</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>API Key的ID</p>
     * @param KeyId <p>API Key的ID</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>模型</p> 
     * @return Model <p>模型</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型</p>
     * @param Model <p>模型</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>所属厂商</p> 
     * @return Provider <p>所属厂商</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>所属厂商</p>
     * @param Provider <p>所属厂商</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>请求状态</p><p>枚举值：</p><ul><li>failure： 失败</li><li>success： 成功</li></ul> 
     * @return Status <p>请求状态</p><p>枚举值：</p><ul><li>failure： 失败</li><li>success： 成功</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>请求状态</p><p>枚举值：</p><ul><li>failure： 失败</li><li>success： 成功</li></ul>
     * @param Status <p>请求状态</p><p>枚举值：</p><ul><li>failure： 失败</li><li>success： 成功</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>最大重试次数</p> 
     * @return MaxRetries <p>最大重试次数</p>
     */
    public Long getMaxRetries() {
        return this.MaxRetries;
    }

    /**
     * Set <p>最大重试次数</p>
     * @param MaxRetries <p>最大重试次数</p>
     */
    public void setMaxRetries(Long MaxRetries) {
        this.MaxRetries = MaxRetries;
    }

    /**
     * Get <p>单次请求消耗的总Token数量</p> 
     * @return TotalTokens <p>单次请求消耗的总Token数量</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>单次请求消耗的总Token数量</p>
     * @param TotalTokens <p>单次请求消耗的总Token数量</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get <p>单次请求输入消耗的Token数量</p> 
     * @return InputTokens <p>单次请求输入消耗的Token数量</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>单次请求输入消耗的Token数量</p>
     * @param InputTokens <p>单次请求输入消耗的Token数量</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>单次请求输出消耗的Token数量</p> 
     * @return OutputTokens <p>单次请求输出消耗的Token数量</p>
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>单次请求输出消耗的Token数量</p>
     * @param OutputTokens <p>单次请求输出消耗的Token数量</p>
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>请求耗时</p><p>单位：ms</p> 
     * @return RequestDuration <p>请求耗时</p><p>单位：ms</p>
     */
    public Long getRequestDuration() {
        return this.RequestDuration;
    }

    /**
     * Set <p>请求耗时</p><p>单位：ms</p>
     * @param RequestDuration <p>请求耗时</p><p>单位：ms</p>
     */
    public void setRequestDuration(Long RequestDuration) {
        this.RequestDuration = RequestDuration;
    }

    /**
     * Get <p>请求IP</p> 
     * @return RequesterIp <p>请求IP</p>
     */
    public String getRequesterIp() {
        return this.RequesterIp;
    }

    /**
     * Set <p>请求IP</p>
     * @param RequesterIp <p>请求IP</p>
     */
    public void setRequesterIp(String RequesterIp) {
        this.RequesterIp = RequesterIp;
    }

    /**
     * Get <p>日志查询起始时间</p> 
     * @return StartTime <p>日志查询起始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>日志查询起始时间</p>
     * @param StartTime <p>日志查询起始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>日志查询结束时间</p> 
     * @return EndTime <p>日志查询结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>日志查询结束时间</p>
     * @param EndTime <p>日志查询结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ModelRouterLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelRouterLog(ModelRouterLog source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MaxRetries != null) {
            this.MaxRetries = new Long(source.MaxRetries);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.RequestDuration != null) {
            this.RequestDuration = new Long(source.RequestDuration);
        }
        if (source.RequesterIp != null) {
            this.RequesterIp = new String(source.RequesterIp);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MaxRetries", this.MaxRetries);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "RequestDuration", this.RequestDuration);
        this.setParamSimple(map, prefix + "RequesterIp", this.RequesterIp);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

