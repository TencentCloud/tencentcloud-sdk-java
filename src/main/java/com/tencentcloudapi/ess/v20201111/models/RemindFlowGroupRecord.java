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

public class RemindFlowGroupRecord extends AbstractModel {

    /**
    * <p>对应签署人出现的合同列表</p>
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * <p>对应签署人出现的合同名</p>
    */
    @SerializedName("FlowNames")
    @Expose
    private String [] FlowNames;

    /**
    * <p>签署人姓名</p>
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * <p>签署人手机号</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>催办合同组下签署人维度详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemindMessageList")
    @Expose
    private RemindFlowGroupDetail [] RemindMessageList;

    /**
     * Get <p>对应签署人出现的合同列表</p> 
     * @return FlowIds <p>对应签署人出现的合同列表</p>
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set <p>对应签署人出现的合同列表</p>
     * @param FlowIds <p>对应签署人出现的合同列表</p>
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get <p>对应签署人出现的合同名</p> 
     * @return FlowNames <p>对应签署人出现的合同名</p>
     */
    public String [] getFlowNames() {
        return this.FlowNames;
    }

    /**
     * Set <p>对应签署人出现的合同名</p>
     * @param FlowNames <p>对应签署人出现的合同名</p>
     */
    public void setFlowNames(String [] FlowNames) {
        this.FlowNames = FlowNames;
    }

    /**
     * Get <p>签署人姓名</p> 
     * @return ApproverName <p>签署人姓名</p>
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set <p>签署人姓名</p>
     * @param ApproverName <p>签署人姓名</p>
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get <p>签署人手机号</p> 
     * @return Mobile <p>签署人手机号</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>签署人手机号</p>
     * @param Mobile <p>签署人手机号</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>催办合同组下签署人维度详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemindMessageList <p>催办合同组下签署人维度详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemindFlowGroupDetail [] getRemindMessageList() {
        return this.RemindMessageList;
    }

    /**
     * Set <p>催办合同组下签署人维度详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemindMessageList <p>催办合同组下签署人维度详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemindMessageList(RemindFlowGroupDetail [] RemindMessageList) {
        this.RemindMessageList = RemindMessageList;
    }

    public RemindFlowGroupRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemindFlowGroupRecord(RemindFlowGroupRecord source) {
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.FlowNames != null) {
            this.FlowNames = new String[source.FlowNames.length];
            for (int i = 0; i < source.FlowNames.length; i++) {
                this.FlowNames[i] = new String(source.FlowNames[i]);
            }
        }
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.RemindMessageList != null) {
            this.RemindMessageList = new RemindFlowGroupDetail[source.RemindMessageList.length];
            for (int i = 0; i < source.RemindMessageList.length; i++) {
                this.RemindMessageList[i] = new RemindFlowGroupDetail(source.RemindMessageList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamArraySimple(map, prefix + "FlowNames.", this.FlowNames);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamArrayObj(map, prefix + "RemindMessageList.", this.RemindMessageList);

    }
}

