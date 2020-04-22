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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LivePackageInfo extends AbstractModel{

    /**
    * 包 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 总量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 使用量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * 剩余量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * 购买时间。
    */
    @SerializedName("BuyTime")
    @Expose
    private String BuyTime;

    /**
    * 过期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 包类型，可选值:
0: 流量包。
1: 普通转码包。
2: 极速高清包。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 包状态，可选值:
0: 未使用。
1: 使用中。
2: 已过期。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 包 ID。 
     * @return Id 包 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 包 ID。
     * @param Id 包 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 总量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。 
     * @return Total 总量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
     * @param Total 总量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 使用量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。 
     * @return Used 使用量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 使用量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
     * @param Used 使用量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get 剩余量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。 
     * @return Left 剩余量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set 剩余量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
     * @param Left 剩余量。
注意：当为流量包时单位为字节。
当为转码包时单位为分钟。
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get 购买时间。 
     * @return BuyTime 购买时间。
     */
    public String getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set 购买时间。
     * @param BuyTime 购买时间。
     */
    public void setBuyTime(String BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get 过期时间。 
     * @return ExpireTime 过期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间。
     * @param ExpireTime 过期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 包类型，可选值:
0: 流量包。
1: 普通转码包。
2: 极速高清包。 
     * @return Type 包类型，可选值:
0: 流量包。
1: 普通转码包。
2: 极速高清包。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 包类型，可选值:
0: 流量包。
1: 普通转码包。
2: 极速高清包。
     * @param Type 包类型，可选值:
0: 流量包。
1: 普通转码包。
2: 极速高清包。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 包状态，可选值:
0: 未使用。
1: 使用中。
2: 已过期。 
     * @return Status 包状态，可选值:
0: 未使用。
1: 使用中。
2: 已过期。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 包状态，可选值:
0: 未使用。
1: 使用中。
2: 已过期。
     * @param Status 包状态，可选值:
0: 未使用。
1: 使用中。
2: 已过期。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

