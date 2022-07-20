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
package com.tencentcloudapi.iotvideo.v20211125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BonusInfo extends AbstractModel{

    /**
    * 资源包ID
    */
    @SerializedName("BonusId")
    @Expose
    private Long BonusId;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 资源包配置ID
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 资源总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 资源消耗总数
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * 资源包过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 资源包创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get 资源包ID 
     * @return BonusId 资源包ID
     */
    public Long getBonusId() {
        return this.BonusId;
    }

    /**
     * Set 资源包ID
     * @param BonusId 资源包ID
     */
    public void setBonusId(Long BonusId) {
        this.BonusId = BonusId;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 资源包配置ID 
     * @return PackageId 资源包配置ID
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 资源包配置ID
     * @param PackageId 资源包配置ID
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 资源总数 
     * @return Total 资源总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 资源总数
     * @param Total 资源总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 资源消耗总数 
     * @return Used 资源消耗总数
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 资源消耗总数
     * @param Used 资源消耗总数
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get 资源包过期时间 
     * @return ExpireTime 资源包过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 资源包过期时间
     * @param ExpireTime 资源包过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 资源包创建时间 
     * @return CreateTime 资源包创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 资源包创建时间
     * @param CreateTime 资源包创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public BonusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BonusInfo(BonusInfo source) {
        if (source.BonusId != null) {
            this.BonusId = new Long(source.BonusId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BonusId", this.BonusId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

