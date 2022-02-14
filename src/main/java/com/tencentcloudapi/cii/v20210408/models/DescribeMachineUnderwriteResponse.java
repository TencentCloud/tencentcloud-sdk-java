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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineUnderwriteResponse extends AbstractModel{

    /**
    * 腾讯云主账号ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 操作人子账户ID
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 保单ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 主任务ID
    */
    @SerializedName("MainTaskId")
    @Expose
    private String MainTaskId;

    /**
    * 核保任务ID
    */
    @SerializedName("UnderwriteTaskId")
    @Expose
    private String UnderwriteTaskId;

    /**
    * 结果状态：
0：返回成功
1：结果未生成
2：结果生成失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 机器核保结果
    */
    @SerializedName("UnderwriteResults")
    @Expose
    private MachineUnderwriteOutput [] UnderwriteResults;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 腾讯云主账号ID 
     * @return Uin 腾讯云主账号ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 腾讯云主账号ID
     * @param Uin 腾讯云主账号ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 操作人子账户ID 
     * @return SubAccountUin 操作人子账户ID
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 操作人子账户ID
     * @param SubAccountUin 操作人子账户ID
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 保单ID 
     * @return PolicyId 保单ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 保单ID
     * @param PolicyId 保单ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 主任务ID 
     * @return MainTaskId 主任务ID
     */
    public String getMainTaskId() {
        return this.MainTaskId;
    }

    /**
     * Set 主任务ID
     * @param MainTaskId 主任务ID
     */
    public void setMainTaskId(String MainTaskId) {
        this.MainTaskId = MainTaskId;
    }

    /**
     * Get 核保任务ID 
     * @return UnderwriteTaskId 核保任务ID
     */
    public String getUnderwriteTaskId() {
        return this.UnderwriteTaskId;
    }

    /**
     * Set 核保任务ID
     * @param UnderwriteTaskId 核保任务ID
     */
    public void setUnderwriteTaskId(String UnderwriteTaskId) {
        this.UnderwriteTaskId = UnderwriteTaskId;
    }

    /**
     * Get 结果状态：
0：返回成功
1：结果未生成
2：结果生成失败 
     * @return Status 结果状态：
0：返回成功
1：结果未生成
2：结果生成失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 结果状态：
0：返回成功
1：结果未生成
2：结果生成失败
     * @param Status 结果状态：
0：返回成功
1：结果未生成
2：结果生成失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 机器核保结果 
     * @return UnderwriteResults 机器核保结果
     */
    public MachineUnderwriteOutput [] getUnderwriteResults() {
        return this.UnderwriteResults;
    }

    /**
     * Set 机器核保结果
     * @param UnderwriteResults 机器核保结果
     */
    public void setUnderwriteResults(MachineUnderwriteOutput [] UnderwriteResults) {
        this.UnderwriteResults = UnderwriteResults;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMachineUnderwriteResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineUnderwriteResponse(DescribeMachineUnderwriteResponse source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.MainTaskId != null) {
            this.MainTaskId = new String(source.MainTaskId);
        }
        if (source.UnderwriteTaskId != null) {
            this.UnderwriteTaskId = new String(source.UnderwriteTaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UnderwriteResults != null) {
            this.UnderwriteResults = new MachineUnderwriteOutput[source.UnderwriteResults.length];
            for (int i = 0; i < source.UnderwriteResults.length; i++) {
                this.UnderwriteResults[i] = new MachineUnderwriteOutput(source.UnderwriteResults[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "MainTaskId", this.MainTaskId);
        this.setParamSimple(map, prefix + "UnderwriteTaskId", this.UnderwriteTaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "UnderwriteResults.", this.UnderwriteResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

