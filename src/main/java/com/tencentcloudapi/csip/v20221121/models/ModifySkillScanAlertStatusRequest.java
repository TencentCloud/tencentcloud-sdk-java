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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySkillScanAlertStatusRequest extends AbstractModel {

    /**
    * 告警记录 ID 列表
入参限制：单次最多 100 个
取值参考：通过 DescribeSkillScanAlertList 接口获取
    */
    @SerializedName("IDs")
    @Expose
    private Long [] IDs;

    /**
    * 目标处理状态
枚举值：
1：已处理
2：已忽略
3：已信任
4：已删除（软删除）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 集团账号的成员 id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get 告警记录 ID 列表
入参限制：单次最多 100 个
取值参考：通过 DescribeSkillScanAlertList 接口获取 
     * @return IDs 告警记录 ID 列表
入参限制：单次最多 100 个
取值参考：通过 DescribeSkillScanAlertList 接口获取
     */
    public Long [] getIDs() {
        return this.IDs;
    }

    /**
     * Set 告警记录 ID 列表
入参限制：单次最多 100 个
取值参考：通过 DescribeSkillScanAlertList 接口获取
     * @param IDs 告警记录 ID 列表
入参限制：单次最多 100 个
取值参考：通过 DescribeSkillScanAlertList 接口获取
     */
    public void setIDs(Long [] IDs) {
        this.IDs = IDs;
    }

    /**
     * Get 目标处理状态
枚举值：
1：已处理
2：已忽略
3：已信任
4：已删除（软删除） 
     * @return Status 目标处理状态
枚举值：
1：已处理
2：已忽略
3：已信任
4：已删除（软删除）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 目标处理状态
枚举值：
1：已处理
2：已忽略
3：已信任
4：已删除（软删除）
     * @param Status 目标处理状态
枚举值：
1：已处理
2：已忽略
3：已信任
4：已删除（软删除）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 集团账号的成员 id 
     * @return MemberId 集团账号的成员 id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员 id
     * @param MemberId 集团账号的成员 id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifySkillScanAlertStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySkillScanAlertStatusRequest(ModifySkillScanAlertStatusRequest source) {
        if (source.IDs != null) {
            this.IDs = new Long[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new Long(source.IDs[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

