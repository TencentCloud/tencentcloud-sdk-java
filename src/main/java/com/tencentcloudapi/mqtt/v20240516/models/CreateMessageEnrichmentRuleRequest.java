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

public class CreateMessageEnrichmentRuleRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则匹配条件，JSON格式，需要Base64编码
样例
{"clientId":"client-1","username":"client-1","topic":"home/room1"}
Base64后
eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 规则执行的动作，JSON格式，需要Base64编码
样例
{"messageExpiryInterval":360,"responseTopic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"}]}
BASE64后
eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2VUb3BpYyI6InJlcGxpZXMvZGV2aWNlcy8ke2NsaWVudGlkfSIsImNvcnJlbGF0aW9uRGF0YSI6IiR7dHJhY2VpZH0iLCJ1c2VyUHJvcGVydHkiOlt7ImtleSI6InRyYWNlLWlkIiwidmFsdWUiOiIke3RyYWNlaWR9In1dfQ==
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * 规则优先级，数字越小，优先级越高，高优先级覆盖低低优先级。UserPropertiy字段会合并
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 策略状态。 0:未定义；1:激活；2:不激活；默认不激活
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 备注，长度不超过128个字符。
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
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则匹配条件，JSON格式，需要Base64编码
样例
{"clientId":"client-1","username":"client-1","topic":"home/room1"}
Base64后
eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9 
     * @return Condition 规则匹配条件，JSON格式，需要Base64编码
样例
{"clientId":"client-1","username":"client-1","topic":"home/room1"}
Base64后
eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 规则匹配条件，JSON格式，需要Base64编码
样例
{"clientId":"client-1","username":"client-1","topic":"home/room1"}
Base64后
eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9
     * @param Condition 规则匹配条件，JSON格式，需要Base64编码
样例
{"clientId":"client-1","username":"client-1","topic":"home/room1"}
Base64后
eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 规则执行的动作，JSON格式，需要Base64编码
样例
{"messageExpiryInterval":360,"responseTopic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"}]}
BASE64后
eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2VUb3BpYyI6InJlcGxpZXMvZGV2aWNlcy8ke2NsaWVudGlkfSIsImNvcnJlbGF0aW9uRGF0YSI6IiR7dHJhY2VpZH0iLCJ1c2VyUHJvcGVydHkiOlt7ImtleSI6InRyYWNlLWlkIiwidmFsdWUiOiIke3RyYWNlaWR9In1dfQ== 
     * @return Actions 规则执行的动作，JSON格式，需要Base64编码
样例
{"messageExpiryInterval":360,"responseTopic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"}]}
BASE64后
eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2VUb3BpYyI6InJlcGxpZXMvZGV2aWNlcy8ke2NsaWVudGlkfSIsImNvcnJlbGF0aW9uRGF0YSI6IiR7dHJhY2VpZH0iLCJ1c2VyUHJvcGVydHkiOlt7ImtleSI6InRyYWNlLWlkIiwidmFsdWUiOiIke3RyYWNlaWR9In1dfQ==
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set 规则执行的动作，JSON格式，需要Base64编码
样例
{"messageExpiryInterval":360,"responseTopic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"}]}
BASE64后
eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2VUb3BpYyI6InJlcGxpZXMvZGV2aWNlcy8ke2NsaWVudGlkfSIsImNvcnJlbGF0aW9uRGF0YSI6IiR7dHJhY2VpZH0iLCJ1c2VyUHJvcGVydHkiOlt7ImtleSI6InRyYWNlLWlkIiwidmFsdWUiOiIke3RyYWNlaWR9In1dfQ==
     * @param Actions 规则执行的动作，JSON格式，需要Base64编码
样例
{"messageExpiryInterval":360,"responseTopic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"}]}
BASE64后
eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2VUb3BpYyI6InJlcGxpZXMvZGV2aWNlcy8ke2NsaWVudGlkfSIsImNvcnJlbGF0aW9uRGF0YSI6IiR7dHJhY2VpZH0iLCJ1c2VyUHJvcGVydHkiOlt7ImtleSI6InRyYWNlLWlkIiwidmFsdWUiOiIke3RyYWNlaWR9In1dfQ==
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 规则优先级，数字越小，优先级越高，高优先级覆盖低低优先级。UserPropertiy字段会合并 
     * @return Priority 规则优先级，数字越小，优先级越高，高优先级覆盖低低优先级。UserPropertiy字段会合并
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 规则优先级，数字越小，优先级越高，高优先级覆盖低低优先级。UserPropertiy字段会合并
     * @param Priority 规则优先级，数字越小，优先级越高，高优先级覆盖低低优先级。UserPropertiy字段会合并
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 策略状态。 0:未定义；1:激活；2:不激活；默认不激活 
     * @return Status 策略状态。 0:未定义；1:激活；2:不激活；默认不激活
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 策略状态。 0:未定义；1:激活；2:不激活；默认不激活
     * @param Status 策略状态。 0:未定义；1:激活；2:不激活；默认不激活
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 备注，长度不超过128个字符。 
     * @return Remark 备注，长度不超过128个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，长度不超过128个字符。
     * @param Remark 备注，长度不超过128个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateMessageEnrichmentRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMessageEnrichmentRuleRequest(CreateMessageEnrichmentRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Actions != null) {
            this.Actions = new String(source.Actions);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Actions", this.Actions);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

