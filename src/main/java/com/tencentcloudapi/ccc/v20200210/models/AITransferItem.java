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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AITransferItem extends AbstractModel {

    /**
    * 转人工的function calling 名称
    */
    @SerializedName("TransferFunctionName")
    @Expose
    private String TransferFunctionName;

    /**
    * TransferFunctionEnable为true时生效；transfer_to_human function calling的desc，默认为 "Transfer to human when the user has to transfer to human (like says transfer to human) or you are instructed to do so."
    */
    @SerializedName("TransferFunctionDesc")
    @Expose
    private String TransferFunctionDesc;

    /**
    * 转人工的技能组ID
    */
    @SerializedName("TransferSkillGroupId")
    @Expose
    private Long TransferSkillGroupId;

    /**
     * Get 转人工的function calling 名称 
     * @return TransferFunctionName 转人工的function calling 名称
     */
    public String getTransferFunctionName() {
        return this.TransferFunctionName;
    }

    /**
     * Set 转人工的function calling 名称
     * @param TransferFunctionName 转人工的function calling 名称
     */
    public void setTransferFunctionName(String TransferFunctionName) {
        this.TransferFunctionName = TransferFunctionName;
    }

    /**
     * Get TransferFunctionEnable为true时生效；transfer_to_human function calling的desc，默认为 "Transfer to human when the user has to transfer to human (like says transfer to human) or you are instructed to do so." 
     * @return TransferFunctionDesc TransferFunctionEnable为true时生效；transfer_to_human function calling的desc，默认为 "Transfer to human when the user has to transfer to human (like says transfer to human) or you are instructed to do so."
     */
    public String getTransferFunctionDesc() {
        return this.TransferFunctionDesc;
    }

    /**
     * Set TransferFunctionEnable为true时生效；transfer_to_human function calling的desc，默认为 "Transfer to human when the user has to transfer to human (like says transfer to human) or you are instructed to do so."
     * @param TransferFunctionDesc TransferFunctionEnable为true时生效；transfer_to_human function calling的desc，默认为 "Transfer to human when the user has to transfer to human (like says transfer to human) or you are instructed to do so."
     */
    public void setTransferFunctionDesc(String TransferFunctionDesc) {
        this.TransferFunctionDesc = TransferFunctionDesc;
    }

    /**
     * Get 转人工的技能组ID 
     * @return TransferSkillGroupId 转人工的技能组ID
     */
    public Long getTransferSkillGroupId() {
        return this.TransferSkillGroupId;
    }

    /**
     * Set 转人工的技能组ID
     * @param TransferSkillGroupId 转人工的技能组ID
     */
    public void setTransferSkillGroupId(Long TransferSkillGroupId) {
        this.TransferSkillGroupId = TransferSkillGroupId;
    }

    public AITransferItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AITransferItem(AITransferItem source) {
        if (source.TransferFunctionName != null) {
            this.TransferFunctionName = new String(source.TransferFunctionName);
        }
        if (source.TransferFunctionDesc != null) {
            this.TransferFunctionDesc = new String(source.TransferFunctionDesc);
        }
        if (source.TransferSkillGroupId != null) {
            this.TransferSkillGroupId = new Long(source.TransferSkillGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransferFunctionName", this.TransferFunctionName);
        this.setParamSimple(map, prefix + "TransferFunctionDesc", this.TransferFunctionDesc);
        this.setParamSimple(map, prefix + "TransferSkillGroupId", this.TransferSkillGroupId);

    }
}

