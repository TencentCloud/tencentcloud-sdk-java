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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowDetailInfo extends AbstractModel {

    /**
    * 合同流程ID，为32位字符串。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 合同流程的类别分类（如销售合同/入职合同等）。	
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 合同流程当前的签署状态, 会存在下列的状态值 <ul><li> **0** : 未开启流程(合同中不存在填写环节)</li> <li> **1** : 待签署</li> <li> **2** : 部分签署</li> <li> **3** : 已拒签</li> <li> **4** : 已签署</li> <li> **5** : 已过期</li> <li> **6** : 已撤销</li> <li> **7** : 未开启流程(合同中存在填写环节)</li> <li> **8** : 等待填写</li> <li> **9** : 部分填写</li> <li> **10** : 已拒填</li> <li> **21** : 已解除</li></ul>	
    */
    @SerializedName("FlowStatus")
    @Expose
    private Long FlowStatus;

    /**
    * 当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。	
    */
    @SerializedName("FlowMessage")
    @Expose
    private String FlowMessage;

    /**
    * 合同流程描述信息。	
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 合同流程的创建时间戳，格式为Unix标准时间戳（秒）。	
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 合同流程的签署方数组
    */
    @SerializedName("FlowApproverInfos")
    @Expose
    private FlowApproverDetail [] FlowApproverInfos;

    /**
    * 合同流程的关注方信息数组
    */
    @SerializedName("CcInfos")
    @Expose
    private FlowApproverDetail [] CcInfos;

    /**
    * 合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。	
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

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
     * Get 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。 
     * @return FlowName 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     * @param FlowName 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
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
     * Get 合同流程当前的签署状态, 会存在下列的状态值 <ul><li> **0** : 未开启流程(合同中不存在填写环节)</li> <li> **1** : 待签署</li> <li> **2** : 部分签署</li> <li> **3** : 已拒签</li> <li> **4** : 已签署</li> <li> **5** : 已过期</li> <li> **6** : 已撤销</li> <li> **7** : 未开启流程(合同中存在填写环节)</li> <li> **8** : 等待填写</li> <li> **9** : 部分填写</li> <li> **10** : 已拒填</li> <li> **21** : 已解除</li></ul>	 
     * @return FlowStatus 合同流程当前的签署状态, 会存在下列的状态值 <ul><li> **0** : 未开启流程(合同中不存在填写环节)</li> <li> **1** : 待签署</li> <li> **2** : 部分签署</li> <li> **3** : 已拒签</li> <li> **4** : 已签署</li> <li> **5** : 已过期</li> <li> **6** : 已撤销</li> <li> **7** : 未开启流程(合同中存在填写环节)</li> <li> **8** : 等待填写</li> <li> **9** : 部分填写</li> <li> **10** : 已拒填</li> <li> **21** : 已解除</li></ul>	
     */
    public Long getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set 合同流程当前的签署状态, 会存在下列的状态值 <ul><li> **0** : 未开启流程(合同中不存在填写环节)</li> <li> **1** : 待签署</li> <li> **2** : 部分签署</li> <li> **3** : 已拒签</li> <li> **4** : 已签署</li> <li> **5** : 已过期</li> <li> **6** : 已撤销</li> <li> **7** : 未开启流程(合同中存在填写环节)</li> <li> **8** : 等待填写</li> <li> **9** : 部分填写</li> <li> **10** : 已拒填</li> <li> **21** : 已解除</li></ul>	
     * @param FlowStatus 合同流程当前的签署状态, 会存在下列的状态值 <ul><li> **0** : 未开启流程(合同中不存在填写环节)</li> <li> **1** : 待签署</li> <li> **2** : 部分签署</li> <li> **3** : 已拒签</li> <li> **4** : 已签署</li> <li> **5** : 已过期</li> <li> **6** : 已撤销</li> <li> **7** : 未开启流程(合同中存在填写环节)</li> <li> **8** : 等待填写</li> <li> **9** : 部分填写</li> <li> **10** : 已拒填</li> <li> **21** : 已解除</li></ul>	
     */
    public void setFlowStatus(Long FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get 当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。	 
     * @return FlowMessage 当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。	
     */
    public String getFlowMessage() {
        return this.FlowMessage;
    }

    /**
     * Set 当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。	
     * @param FlowMessage 当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。	
     */
    public void setFlowMessage(String FlowMessage) {
        this.FlowMessage = FlowMessage;
    }

    /**
     * Get 合同流程描述信息。	 
     * @return FlowDescription 合同流程描述信息。	
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 合同流程描述信息。	
     * @param FlowDescription 合同流程描述信息。	
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 合同流程的创建时间戳，格式为Unix标准时间戳（秒）。	 
     * @return CreatedOn 合同流程的创建时间戳，格式为Unix标准时间戳（秒）。	
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 合同流程的创建时间戳，格式为Unix标准时间戳（秒）。	
     * @param CreatedOn 合同流程的创建时间戳，格式为Unix标准时间戳（秒）。	
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 合同流程的签署方数组 
     * @return FlowApproverInfos 合同流程的签署方数组
     */
    public FlowApproverDetail [] getFlowApproverInfos() {
        return this.FlowApproverInfos;
    }

    /**
     * Set 合同流程的签署方数组
     * @param FlowApproverInfos 合同流程的签署方数组
     */
    public void setFlowApproverInfos(FlowApproverDetail [] FlowApproverInfos) {
        this.FlowApproverInfos = FlowApproverInfos;
    }

    /**
     * Get 合同流程的关注方信息数组 
     * @return CcInfos 合同流程的关注方信息数组
     */
    public FlowApproverDetail [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set 合同流程的关注方信息数组
     * @param CcInfos 合同流程的关注方信息数组
     */
    public void setCcInfos(FlowApproverDetail [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get 合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。	 
     * @return Creator 合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。	
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。	
     * @param Creator 合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。	
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    public FlowDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowDetailInfo(FlowDetailInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowStatus != null) {
            this.FlowStatus = new Long(source.FlowStatus);
        }
        if (source.FlowMessage != null) {
            this.FlowMessage = new String(source.FlowMessage);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.FlowApproverInfos != null) {
            this.FlowApproverInfos = new FlowApproverDetail[source.FlowApproverInfos.length];
            for (int i = 0; i < source.FlowApproverInfos.length; i++) {
                this.FlowApproverInfos[i] = new FlowApproverDetail(source.FlowApproverInfos[i]);
            }
        }
        if (source.CcInfos != null) {
            this.CcInfos = new FlowApproverDetail[source.CcInfos.length];
            for (int i = 0; i < source.CcInfos.length; i++) {
                this.CcInfos[i] = new FlowApproverDetail(source.CcInfos[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowStatus", this.FlowStatus);
        this.setParamSimple(map, prefix + "FlowMessage", this.FlowMessage);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamArrayObj(map, prefix + "FlowApproverInfos.", this.FlowApproverInfos);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);
        this.setParamSimple(map, prefix + "Creator", this.Creator);

    }
}

