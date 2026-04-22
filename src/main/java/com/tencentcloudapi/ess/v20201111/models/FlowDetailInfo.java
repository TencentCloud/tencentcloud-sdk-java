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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowDetailInfo extends AbstractModel {

    /**
    * <p>合同流程ID，为32位字符串。</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * <p>合同流程的类别分类（如销售合同/入职合同等）。<br>该字段将被废弃，不建议使用。</p>
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * <p>合同流程当前的签署状态, 会存在下列的状态值 </p><ul><li> **0** : 未开启流程(合同中不存在填写环节)</li> <li> **1** : 待签署</li> <li> **2** : 部分签署</li> <li> **3** : 已拒签</li> <li> **4** : 已签署</li> <li> **5** : 已过期</li> <li> **6** : 已撤销</li> <li> **7** : 未开启流程(合同中存在填写环节)</li> <li> **8** : 等待填写</li> <li> **9** : 部分填写</li> <li> **10** : 已拒填</li> <li> **16** : 已失效（可能因为参与方修改姓名等原因）</li> <li> **21** : 已解除</li></ul>
    */
    @SerializedName("FlowStatus")
    @Expose
    private Long FlowStatus;

    /**
    * <p>当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。</p>
    */
    @SerializedName("FlowMessage")
    @Expose
    private String FlowMessage;

    /**
    * <p>合同流程描述信息。</p>
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * <p>合同流程的创建时间戳，格式为Unix标准时间戳（秒）。</p>
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * <p>合同流程的签署方数组</p>
    */
    @SerializedName("FlowApproverInfos")
    @Expose
    private FlowApproverDetail [] FlowApproverInfos;

    /**
    * <p>合同流程的关注方信息数组</p>
    */
    @SerializedName("CcInfos")
    @Expose
    private FlowApproverDetail [] CcInfos;

    /**
    * <p>合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>用户合同的自定义分类。</p><p>自定义合同类型的位置，在下图所示地方:<br><img src="https://qcloudimg.tencent-cloud.cn/raw/00d72934c31bd49115a566e4e1a4530d.png" alt="image"></p>
    */
    @SerializedName("UserFlowType")
    @Expose
    private UserFlowType UserFlowType;

    /**
    * <p>发起模板时,使用的模板Id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>合同备注列表</p>
    */
    @SerializedName("FlowRemarks")
    @Expose
    private String [] FlowRemarks;

    /**
     * Get <p>合同流程ID，为32位字符串。</p> 
     * @return FlowId <p>合同流程ID，为32位字符串。</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>合同流程ID，为32位字符串。</p>
     * @param FlowId <p>合同流程ID，为32位字符串。</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p> 
     * @return FlowName <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     * @param FlowName <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get <p>合同流程的类别分类（如销售合同/入职合同等）。<br>该字段将被废弃，不建议使用。</p> 
     * @return FlowType <p>合同流程的类别分类（如销售合同/入职合同等）。<br>该字段将被废弃，不建议使用。</p>
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set <p>合同流程的类别分类（如销售合同/入职合同等）。<br>该字段将被废弃，不建议使用。</p>
     * @param FlowType <p>合同流程的类别分类（如销售合同/入职合同等）。<br>该字段将被废弃，不建议使用。</p>
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get <p>合同流程当前的签署状态, 会存在下列的状态值 </p><ul><li> **0** : 未开启流程(合同中不存在填写环节)</li> <li> **1** : 待签署</li> <li> **2** : 部分签署</li> <li> **3** : 已拒签</li> <li> **4** : 已签署</li> <li> **5** : 已过期</li> <li> **6** : 已撤销</li> <li> **7** : 未开启流程(合同中存在填写环节)</li> <li> **8** : 等待填写</li> <li> **9** : 部分填写</li> <li> **10** : 已拒填</li> <li> **16** : 已失效（可能因为参与方修改姓名等原因）</li> <li> **21** : 已解除</li></ul> 
     * @return FlowStatus <p>合同流程当前的签署状态, 会存在下列的状态值 </p><ul><li> **0** : 未开启流程(合同中不存在填写环节)</li> <li> **1** : 待签署</li> <li> **2** : 部分签署</li> <li> **3** : 已拒签</li> <li> **4** : 已签署</li> <li> **5** : 已过期</li> <li> **6** : 已撤销</li> <li> **7** : 未开启流程(合同中存在填写环节)</li> <li> **8** : 等待填写</li> <li> **9** : 部分填写</li> <li> **10** : 已拒填</li> <li> **16** : 已失效（可能因为参与方修改姓名等原因）</li> <li> **21** : 已解除</li></ul>
     */
    public Long getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set <p>合同流程当前的签署状态, 会存在下列的状态值 </p><ul><li> **0** : 未开启流程(合同中不存在填写环节)</li> <li> **1** : 待签署</li> <li> **2** : 部分签署</li> <li> **3** : 已拒签</li> <li> **4** : 已签署</li> <li> **5** : 已过期</li> <li> **6** : 已撤销</li> <li> **7** : 未开启流程(合同中存在填写环节)</li> <li> **8** : 等待填写</li> <li> **9** : 部分填写</li> <li> **10** : 已拒填</li> <li> **16** : 已失效（可能因为参与方修改姓名等原因）</li> <li> **21** : 已解除</li></ul>
     * @param FlowStatus <p>合同流程当前的签署状态, 会存在下列的状态值 </p><ul><li> **0** : 未开启流程(合同中不存在填写环节)</li> <li> **1** : 待签署</li> <li> **2** : 部分签署</li> <li> **3** : 已拒签</li> <li> **4** : 已签署</li> <li> **5** : 已过期</li> <li> **6** : 已撤销</li> <li> **7** : 未开启流程(合同中存在填写环节)</li> <li> **8** : 等待填写</li> <li> **9** : 部分填写</li> <li> **10** : 已拒填</li> <li> **16** : 已失效（可能因为参与方修改姓名等原因）</li> <li> **21** : 已解除</li></ul>
     */
    public void setFlowStatus(Long FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get <p>当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。</p> 
     * @return FlowMessage <p>当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。</p>
     */
    public String getFlowMessage() {
        return this.FlowMessage;
    }

    /**
     * Set <p>当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。</p>
     * @param FlowMessage <p>当合同流程状态为已拒签（即 FlowStatus=3）或已撤销（即 FlowStatus=6）时，此字段 FlowMessage 为拒签或撤销原因。</p>
     */
    public void setFlowMessage(String FlowMessage) {
        this.FlowMessage = FlowMessage;
    }

    /**
     * Get <p>合同流程描述信息。</p> 
     * @return FlowDescription <p>合同流程描述信息。</p>
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set <p>合同流程描述信息。</p>
     * @param FlowDescription <p>合同流程描述信息。</p>
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get <p>合同流程的创建时间戳，格式为Unix标准时间戳（秒）。</p> 
     * @return CreatedOn <p>合同流程的创建时间戳，格式为Unix标准时间戳（秒）。</p>
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set <p>合同流程的创建时间戳，格式为Unix标准时间戳（秒）。</p>
     * @param CreatedOn <p>合同流程的创建时间戳，格式为Unix标准时间戳（秒）。</p>
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get <p>合同流程的签署方数组</p> 
     * @return FlowApproverInfos <p>合同流程的签署方数组</p>
     */
    public FlowApproverDetail [] getFlowApproverInfos() {
        return this.FlowApproverInfos;
    }

    /**
     * Set <p>合同流程的签署方数组</p>
     * @param FlowApproverInfos <p>合同流程的签署方数组</p>
     */
    public void setFlowApproverInfos(FlowApproverDetail [] FlowApproverInfos) {
        this.FlowApproverInfos = FlowApproverInfos;
    }

    /**
     * Get <p>合同流程的关注方信息数组</p> 
     * @return CcInfos <p>合同流程的关注方信息数组</p>
     */
    public FlowApproverDetail [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set <p>合同流程的关注方信息数组</p>
     * @param CcInfos <p>合同流程的关注方信息数组</p>
     */
    public void setCcInfos(FlowApproverDetail [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get <p>合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。</p> 
     * @return Creator <p>合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。</p>
     * @param Creator <p>合同流程发起方的员工编号, 即员工在腾讯电子签平台的唯一身份标识。</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>用户合同的自定义分类。</p><p>自定义合同类型的位置，在下图所示地方:<br><img src="https://qcloudimg.tencent-cloud.cn/raw/00d72934c31bd49115a566e4e1a4530d.png" alt="image"></p> 
     * @return UserFlowType <p>用户合同的自定义分类。</p><p>自定义合同类型的位置，在下图所示地方:<br><img src="https://qcloudimg.tencent-cloud.cn/raw/00d72934c31bd49115a566e4e1a4530d.png" alt="image"></p>
     */
    public UserFlowType getUserFlowType() {
        return this.UserFlowType;
    }

    /**
     * Set <p>用户合同的自定义分类。</p><p>自定义合同类型的位置，在下图所示地方:<br><img src="https://qcloudimg.tencent-cloud.cn/raw/00d72934c31bd49115a566e4e1a4530d.png" alt="image"></p>
     * @param UserFlowType <p>用户合同的自定义分类。</p><p>自定义合同类型的位置，在下图所示地方:<br><img src="https://qcloudimg.tencent-cloud.cn/raw/00d72934c31bd49115a566e4e1a4530d.png" alt="image"></p>
     */
    public void setUserFlowType(UserFlowType UserFlowType) {
        this.UserFlowType = UserFlowType;
    }

    /**
     * Get <p>发起模板时,使用的模板Id</p> 
     * @return TemplateId <p>发起模板时,使用的模板Id</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>发起模板时,使用的模板Id</p>
     * @param TemplateId <p>发起模板时,使用的模板Id</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>合同备注列表</p> 
     * @return FlowRemarks <p>合同备注列表</p>
     */
    public String [] getFlowRemarks() {
        return this.FlowRemarks;
    }

    /**
     * Set <p>合同备注列表</p>
     * @param FlowRemarks <p>合同备注列表</p>
     */
    public void setFlowRemarks(String [] FlowRemarks) {
        this.FlowRemarks = FlowRemarks;
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
        if (source.UserFlowType != null) {
            this.UserFlowType = new UserFlowType(source.UserFlowType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.FlowRemarks != null) {
            this.FlowRemarks = new String[source.FlowRemarks.length];
            for (int i = 0; i < source.FlowRemarks.length; i++) {
                this.FlowRemarks[i] = new String(source.FlowRemarks[i]);
            }
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
        this.setParamObj(map, prefix + "UserFlowType.", this.UserFlowType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "FlowRemarks.", this.FlowRemarks);

    }
}

