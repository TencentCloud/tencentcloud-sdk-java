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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebPageServiceInfoResponse extends AbstractModel{

    /**
    * 是否已购服务：true-是，false-否
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 已使用授权数
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
    * 剩余授权数
    */
    @SerializedName("ResidueNum")
    @Expose
    private Long ResidueNum;

    /**
    * 已购授权数
    */
    @SerializedName("BuyNum")
    @Expose
    private Long BuyNum;

    /**
    * 临近到期数量
    */
    @SerializedName("ExpireNum")
    @Expose
    private Long ExpireNum;

    /**
    * 所有授权机器信息
    */
    @SerializedName("AllAuthorizedMachines")
    @Expose
    private ProtectMachineInfo [] AllAuthorizedMachines;

    /**
    * 临近到期授权机器信息
    */
    @SerializedName("ExpireAuthorizedMachines")
    @Expose
    private ProtectMachine [] ExpireAuthorizedMachines;

    /**
    * 已过期授权数
    */
    @SerializedName("ExpiredNum")
    @Expose
    private Long ExpiredNum;

    /**
    * 防护目录数
    */
    @SerializedName("ProtectDirNum")
    @Expose
    private Long ProtectDirNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否已购服务：true-是，false-否 
     * @return Status 是否已购服务：true-是，false-否
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 是否已购服务：true-是，false-否
     * @param Status 是否已购服务：true-是，false-否
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 已使用授权数 
     * @return UsedNum 已使用授权数
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set 已使用授权数
     * @param UsedNum 已使用授权数
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    /**
     * Get 剩余授权数 
     * @return ResidueNum 剩余授权数
     */
    public Long getResidueNum() {
        return this.ResidueNum;
    }

    /**
     * Set 剩余授权数
     * @param ResidueNum 剩余授权数
     */
    public void setResidueNum(Long ResidueNum) {
        this.ResidueNum = ResidueNum;
    }

    /**
     * Get 已购授权数 
     * @return BuyNum 已购授权数
     */
    public Long getBuyNum() {
        return this.BuyNum;
    }

    /**
     * Set 已购授权数
     * @param BuyNum 已购授权数
     */
    public void setBuyNum(Long BuyNum) {
        this.BuyNum = BuyNum;
    }

    /**
     * Get 临近到期数量 
     * @return ExpireNum 临近到期数量
     */
    public Long getExpireNum() {
        return this.ExpireNum;
    }

    /**
     * Set 临近到期数量
     * @param ExpireNum 临近到期数量
     */
    public void setExpireNum(Long ExpireNum) {
        this.ExpireNum = ExpireNum;
    }

    /**
     * Get 所有授权机器信息 
     * @return AllAuthorizedMachines 所有授权机器信息
     */
    public ProtectMachineInfo [] getAllAuthorizedMachines() {
        return this.AllAuthorizedMachines;
    }

    /**
     * Set 所有授权机器信息
     * @param AllAuthorizedMachines 所有授权机器信息
     */
    public void setAllAuthorizedMachines(ProtectMachineInfo [] AllAuthorizedMachines) {
        this.AllAuthorizedMachines = AllAuthorizedMachines;
    }

    /**
     * Get 临近到期授权机器信息 
     * @return ExpireAuthorizedMachines 临近到期授权机器信息
     */
    public ProtectMachine [] getExpireAuthorizedMachines() {
        return this.ExpireAuthorizedMachines;
    }

    /**
     * Set 临近到期授权机器信息
     * @param ExpireAuthorizedMachines 临近到期授权机器信息
     */
    public void setExpireAuthorizedMachines(ProtectMachine [] ExpireAuthorizedMachines) {
        this.ExpireAuthorizedMachines = ExpireAuthorizedMachines;
    }

    /**
     * Get 已过期授权数 
     * @return ExpiredNum 已过期授权数
     */
    public Long getExpiredNum() {
        return this.ExpiredNum;
    }

    /**
     * Set 已过期授权数
     * @param ExpiredNum 已过期授权数
     */
    public void setExpiredNum(Long ExpiredNum) {
        this.ExpiredNum = ExpiredNum;
    }

    /**
     * Get 防护目录数 
     * @return ProtectDirNum 防护目录数
     */
    public Long getProtectDirNum() {
        return this.ProtectDirNum;
    }

    /**
     * Set 防护目录数
     * @param ProtectDirNum 防护目录数
     */
    public void setProtectDirNum(Long ProtectDirNum) {
        this.ProtectDirNum = ProtectDirNum;
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

    public DescribeWebPageServiceInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebPageServiceInfoResponse(DescribeWebPageServiceInfoResponse source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
        if (source.ResidueNum != null) {
            this.ResidueNum = new Long(source.ResidueNum);
        }
        if (source.BuyNum != null) {
            this.BuyNum = new Long(source.BuyNum);
        }
        if (source.ExpireNum != null) {
            this.ExpireNum = new Long(source.ExpireNum);
        }
        if (source.AllAuthorizedMachines != null) {
            this.AllAuthorizedMachines = new ProtectMachineInfo[source.AllAuthorizedMachines.length];
            for (int i = 0; i < source.AllAuthorizedMachines.length; i++) {
                this.AllAuthorizedMachines[i] = new ProtectMachineInfo(source.AllAuthorizedMachines[i]);
            }
        }
        if (source.ExpireAuthorizedMachines != null) {
            this.ExpireAuthorizedMachines = new ProtectMachine[source.ExpireAuthorizedMachines.length];
            for (int i = 0; i < source.ExpireAuthorizedMachines.length; i++) {
                this.ExpireAuthorizedMachines[i] = new ProtectMachine(source.ExpireAuthorizedMachines[i]);
            }
        }
        if (source.ExpiredNum != null) {
            this.ExpiredNum = new Long(source.ExpiredNum);
        }
        if (source.ProtectDirNum != null) {
            this.ProtectDirNum = new Long(source.ProtectDirNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);
        this.setParamSimple(map, prefix + "ResidueNum", this.ResidueNum);
        this.setParamSimple(map, prefix + "BuyNum", this.BuyNum);
        this.setParamSimple(map, prefix + "ExpireNum", this.ExpireNum);
        this.setParamArrayObj(map, prefix + "AllAuthorizedMachines.", this.AllAuthorizedMachines);
        this.setParamArrayObj(map, prefix + "ExpireAuthorizedMachines.", this.ExpireAuthorizedMachines);
        this.setParamSimple(map, prefix + "ExpiredNum", this.ExpiredNum);
        this.setParamSimple(map, prefix + "ProtectDirNum", this.ProtectDirNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

