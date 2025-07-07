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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CasterBriefInfo extends AbstractModel {

    /**
    * 导播台ID
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * 导播台名称
    */
    @SerializedName("CasterName")
    @Expose
    private String CasterName;

    /**
    * 导播台的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 开始计费时间，值为unix时间戳
    */
    @SerializedName("StartBillingTime")
    @Expose
    private Long StartBillingTime;

    /**
    * 结束计费时间，值为unix时间戳
    */
    @SerializedName("StopBillingTime")
    @Expose
    private Long StopBillingTime;

    /**
    * 创建时间，值为unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 导播台状态
0：停止状态，无预监，无主监
1：无预监，有主监
2：有预监，无主监
3：有预监，有主监
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 导播台的过期时间，值为-1或unix时间戳。
当值为-1时，代表永不过期。
当值为特定unix时间戳时，代表过期时间为对应的时间，导播台在该时间自动停止。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 计费字段，该字段暂无作用
    */
    @SerializedName("FeeType")
    @Expose
    private Long FeeType;

    /**
     * Get 导播台ID 
     * @return CasterId 导播台ID
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set 导播台ID
     * @param CasterId 导播台ID
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get 导播台名称 
     * @return CasterName 导播台名称
     */
    public String getCasterName() {
        return this.CasterName;
    }

    /**
     * Set 导播台名称
     * @param CasterName 导播台名称
     */
    public void setCasterName(String CasterName) {
        this.CasterName = CasterName;
    }

    /**
     * Get 导播台的描述 
     * @return Description 导播台的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 导播台的描述
     * @param Description 导播台的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 开始计费时间，值为unix时间戳 
     * @return StartBillingTime 开始计费时间，值为unix时间戳
     */
    public Long getStartBillingTime() {
        return this.StartBillingTime;
    }

    /**
     * Set 开始计费时间，值为unix时间戳
     * @param StartBillingTime 开始计费时间，值为unix时间戳
     */
    public void setStartBillingTime(Long StartBillingTime) {
        this.StartBillingTime = StartBillingTime;
    }

    /**
     * Get 结束计费时间，值为unix时间戳 
     * @return StopBillingTime 结束计费时间，值为unix时间戳
     */
    public Long getStopBillingTime() {
        return this.StopBillingTime;
    }

    /**
     * Set 结束计费时间，值为unix时间戳
     * @param StopBillingTime 结束计费时间，值为unix时间戳
     */
    public void setStopBillingTime(Long StopBillingTime) {
        this.StopBillingTime = StopBillingTime;
    }

    /**
     * Get 创建时间，值为unix时间戳 
     * @return CreateTime 创建时间，值为unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，值为unix时间戳
     * @param CreateTime 创建时间，值为unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 导播台状态
0：停止状态，无预监，无主监
1：无预监，有主监
2：有预监，无主监
3：有预监，有主监 
     * @return Status 导播台状态
0：停止状态，无预监，无主监
1：无预监，有主监
2：有预监，无主监
3：有预监，有主监
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 导播台状态
0：停止状态，无预监，无主监
1：无预监，有主监
2：有预监，无主监
3：有预监，有主监
     * @param Status 导播台状态
0：停止状态，无预监，无主监
1：无预监，有主监
2：有预监，无主监
3：有预监，有主监
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 导播台的过期时间，值为-1或unix时间戳。
当值为-1时，代表永不过期。
当值为特定unix时间戳时，代表过期时间为对应的时间，导播台在该时间自动停止。 
     * @return ExpireTime 导播台的过期时间，值为-1或unix时间戳。
当值为-1时，代表永不过期。
当值为特定unix时间戳时，代表过期时间为对应的时间，导播台在该时间自动停止。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 导播台的过期时间，值为-1或unix时间戳。
当值为-1时，代表永不过期。
当值为特定unix时间戳时，代表过期时间为对应的时间，导播台在该时间自动停止。
     * @param ExpireTime 导播台的过期时间，值为-1或unix时间戳。
当值为-1时，代表永不过期。
当值为特定unix时间戳时，代表过期时间为对应的时间，导播台在该时间自动停止。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 计费字段，该字段暂无作用 
     * @return FeeType 计费字段，该字段暂无作用
     */
    public Long getFeeType() {
        return this.FeeType;
    }

    /**
     * Set 计费字段，该字段暂无作用
     * @param FeeType 计费字段，该字段暂无作用
     */
    public void setFeeType(Long FeeType) {
        this.FeeType = FeeType;
    }

    public CasterBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CasterBriefInfo(CasterBriefInfo source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.CasterName != null) {
            this.CasterName = new String(source.CasterName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StartBillingTime != null) {
            this.StartBillingTime = new Long(source.StartBillingTime);
        }
        if (source.StopBillingTime != null) {
            this.StopBillingTime = new Long(source.StopBillingTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.FeeType != null) {
            this.FeeType = new Long(source.FeeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamSimple(map, prefix + "CasterName", this.CasterName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StartBillingTime", this.StartBillingTime);
        this.setParamSimple(map, prefix + "StopBillingTime", this.StopBillingTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);

    }
}

