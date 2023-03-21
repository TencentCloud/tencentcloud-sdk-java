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

public class ReleasedApprover extends AbstractModel{

    /**
    * 签署人姓名，最大长度50个字符

    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 签署人手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 要替换的参与人在原合同参与人列表中的签署人编号,通过DescribeFlowInfo 接口获取（即FlowDetailInfos. FlowApproverInfos 结构中的ReceiptId ）
    */
    @SerializedName("RelievedApproverReceiptId")
    @Expose
    private String RelievedApproverReceiptId;

    /**
     * Get 签署人姓名，最大长度50个字符
 
     * @return Name 签署人姓名，最大长度50个字符

     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 签署人姓名，最大长度50个字符

     * @param Name 签署人姓名，最大长度50个字符

     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 签署人手机号 
     * @return Mobile 签署人手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署人手机号
     * @param Mobile 签署人手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 要替换的参与人在原合同参与人列表中的签署人编号,通过DescribeFlowInfo 接口获取（即FlowDetailInfos. FlowApproverInfos 结构中的ReceiptId ） 
     * @return RelievedApproverReceiptId 要替换的参与人在原合同参与人列表中的签署人编号,通过DescribeFlowInfo 接口获取（即FlowDetailInfos. FlowApproverInfos 结构中的ReceiptId ）
     */
    public String getRelievedApproverReceiptId() {
        return this.RelievedApproverReceiptId;
    }

    /**
     * Set 要替换的参与人在原合同参与人列表中的签署人编号,通过DescribeFlowInfo 接口获取（即FlowDetailInfos. FlowApproverInfos 结构中的ReceiptId ）
     * @param RelievedApproverReceiptId 要替换的参与人在原合同参与人列表中的签署人编号,通过DescribeFlowInfo 接口获取（即FlowDetailInfos. FlowApproverInfos 结构中的ReceiptId ）
     */
    public void setRelievedApproverReceiptId(String RelievedApproverReceiptId) {
        this.RelievedApproverReceiptId = RelievedApproverReceiptId;
    }

    public ReleasedApprover() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleasedApprover(ReleasedApprover source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.RelievedApproverReceiptId != null) {
            this.RelievedApproverReceiptId = new String(source.RelievedApproverReceiptId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "RelievedApproverReceiptId", this.RelievedApproverReceiptId);

    }
}

