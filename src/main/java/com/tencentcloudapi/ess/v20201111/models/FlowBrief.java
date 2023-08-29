/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowBrief extends AbstractModel{

    /**
    * 合同流程ID，为32位字符串。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 合同流程的名称。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 合同流程描述信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 合同流程的类别分类（如销售合同/入职合同等）。
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 合同流程当前的签署状态, 会存在下列的状态值
<ul><li> **0** : 未开启流程(合同中不存在填写环节)</li>
<li> **1** : 待签署</li>
<li> **2** : 部分签署</li>
<li> **3** : 已拒签</li>
<li> **4** : 已签署</li>
<li> **5** : 已过期</li>
<li> **6** : 已撤销</li>
<li> **7** : 未开启流程(合同中存在填写环节)</li>
<li> **8** : 等待填写</li>
<li> **9** : 部分填写</li>
<li> **10** : 已拒填</li>
<li> **21** : 已解除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowStatus")
    @Expose
    private Long FlowStatus;

    /**
    * 合同流程创建时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowMessage")
    @Expose
    private String FlowMessage;

    /**
    *  合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 合同流程的签署截止时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
     * Get 合同流程ID，为32位字符串。 
     * @return FlowId 合同流程ID，为32位字符串。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID，为32位字符串。
     * @param FlowId 合同流程ID，为32位字符串。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 合同流程的名称。 
     * @return FlowName 合同流程的名称。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同流程的名称。
     * @param FlowName 合同流程的名称。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 合同流程描述信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowDescription 合同流程描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 合同流程描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowDescription 合同流程描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 合同流程的类别分类（如销售合同/入职合同等）。 
     * @return FlowType 合同流程的类别分类（如销售合同/入职合同等）。
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 合同流程的类别分类（如销售合同/入职合同等）。
     * @param FlowType 合同流程的类别分类（如销售合同/入职合同等）。
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 合同流程当前的签署状态, 会存在下列的状态值
<ul><li> **0** : 未开启流程(合同中不存在填写环节)</li>
<li> **1** : 待签署</li>
<li> **2** : 部分签署</li>
<li> **3** : 已拒签</li>
<li> **4** : 已签署</li>
<li> **5** : 已过期</li>
<li> **6** : 已撤销</li>
<li> **7** : 未开启流程(合同中存在填写环节)</li>
<li> **8** : 等待填写</li>
<li> **9** : 部分填写</li>
<li> **10** : 已拒填</li>
<li> **21** : 已解除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowStatus 合同流程当前的签署状态, 会存在下列的状态值
<ul><li> **0** : 未开启流程(合同中不存在填写环节)</li>
<li> **1** : 待签署</li>
<li> **2** : 部分签署</li>
<li> **3** : 已拒签</li>
<li> **4** : 已签署</li>
<li> **5** : 已过期</li>
<li> **6** : 已撤销</li>
<li> **7** : 未开启流程(合同中存在填写环节)</li>
<li> **8** : 等待填写</li>
<li> **9** : 部分填写</li>
<li> **10** : 已拒填</li>
<li> **21** : 已解除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set 合同流程当前的签署状态, 会存在下列的状态值
<ul><li> **0** : 未开启流程(合同中不存在填写环节)</li>
<li> **1** : 待签署</li>
<li> **2** : 部分签署</li>
<li> **3** : 已拒签</li>
<li> **4** : 已签署</li>
<li> **5** : 已过期</li>
<li> **6** : 已撤销</li>
<li> **7** : 未开启流程(合同中存在填写环节)</li>
<li> **8** : 等待填写</li>
<li> **9** : 部分填写</li>
<li> **10** : 已拒填</li>
<li> **21** : 已解除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowStatus 合同流程当前的签署状态, 会存在下列的状态值
<ul><li> **0** : 未开启流程(合同中不存在填写环节)</li>
<li> **1** : 待签署</li>
<li> **2** : 部分签署</li>
<li> **3** : 已拒签</li>
<li> **4** : 已签署</li>
<li> **5** : 已过期</li>
<li> **6** : 已撤销</li>
<li> **7** : 未开启流程(合同中存在填写环节)</li>
<li> **8** : 等待填写</li>
<li> **9** : 部分填写</li>
<li> **10** : 已拒填</li>
<li> **21** : 已解除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowStatus(Long FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get 合同流程创建时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedOn 合同流程创建时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 合同流程创建时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedOn 合同流程创建时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowMessage 当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowMessage() {
        return this.FlowMessage;
    }

    /**
     * Set 当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowMessage 当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowMessage(String FlowMessage) {
        this.FlowMessage = FlowMessage;
    }

    /**
     * Get  合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator  合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set  合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator  合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 合同流程的签署截止时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deadline 合同流程的签署截止时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 合同流程的签署截止时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deadline 合同流程的签署截止时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    public FlowBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowBrief(FlowBrief source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowStatus != null) {
            this.FlowStatus = new Long(source.FlowStatus);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.FlowMessage != null) {
            this.FlowMessage = new String(source.FlowMessage);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowStatus", this.FlowStatus);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "FlowMessage", this.FlowMessage);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);

    }
}

