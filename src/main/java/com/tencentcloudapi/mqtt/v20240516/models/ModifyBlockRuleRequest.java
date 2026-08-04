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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBlockRuleRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 待修改的封禁规则名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 包含表达式支持*（多个字符）和？（一个字符）
    */
    @SerializedName("Include")
    @Expose
    private String Include;

    /**
    * 排除表达式支持*（多个字符）和？（一个字符），最多三条。
    */
    @SerializedName("Excludes")
    @Expose
    private String [] Excludes;

    /**
    * 过期时间，毫秒级时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 备注，最长 128 字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。 
     * @return InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     * @param InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 待修改的封禁规则名 
     * @return Name 待修改的封禁规则名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 待修改的封禁规则名
     * @param Name 待修改的封禁规则名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 包含表达式支持*（多个字符）和？（一个字符） 
     * @return Include 包含表达式支持*（多个字符）和？（一个字符）
     */
    public String getInclude() {
        return this.Include;
    }

    /**
     * Set 包含表达式支持*（多个字符）和？（一个字符）
     * @param Include 包含表达式支持*（多个字符）和？（一个字符）
     */
    public void setInclude(String Include) {
        this.Include = Include;
    }

    /**
     * Get 排除表达式支持*（多个字符）和？（一个字符），最多三条。 
     * @return Excludes 排除表达式支持*（多个字符）和？（一个字符），最多三条。
     */
    public String [] getExcludes() {
        return this.Excludes;
    }

    /**
     * Set 排除表达式支持*（多个字符）和？（一个字符），最多三条。
     * @param Excludes 排除表达式支持*（多个字符）和？（一个字符），最多三条。
     */
    public void setExcludes(String [] Excludes) {
        this.Excludes = Excludes;
    }

    /**
     * Get 过期时间，毫秒级时间戳 
     * @return ExpireTime 过期时间，毫秒级时间戳
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，毫秒级时间戳
     * @param ExpireTime 过期时间，毫秒级时间戳
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 备注，最长 128 字符 
     * @return Remark 备注，最长 128 字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，最长 128 字符
     * @param Remark 备注，最长 128 字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyBlockRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBlockRuleRequest(ModifyBlockRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Include != null) {
            this.Include = new String(source.Include);
        }
        if (source.Excludes != null) {
            this.Excludes = new String[source.Excludes.length];
            for (int i = 0; i < source.Excludes.length; i++) {
                this.Excludes[i] = new String(source.Excludes[i]);
            }
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Include", this.Include);
        this.setParamArraySimple(map, prefix + "Excludes.", this.Excludes);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

