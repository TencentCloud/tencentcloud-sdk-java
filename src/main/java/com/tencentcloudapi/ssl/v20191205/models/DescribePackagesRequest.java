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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePackagesRequest extends AbstractModel{

    /**
    * 偏移量，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目，默认20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按状态筛选。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 按过期时间升序或降序排列。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 按权益包ID搜索。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 按权益包类型搜索。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 子产品编号
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
     * Get 偏移量，默认0。 
     * @return Offset 偏移量，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0。
     * @param Offset 偏移量，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目，默认20。 
     * @return Limit 限制数目，默认20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目，默认20。
     * @param Limit 限制数目，默认20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按状态筛选。 
     * @return Status 按状态筛选。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 按状态筛选。
     * @param Status 按状态筛选。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 按过期时间升序或降序排列。 
     * @return ExpireTime 按过期时间升序或降序排列。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 按过期时间升序或降序排列。
     * @param ExpireTime 按过期时间升序或降序排列。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 按权益包ID搜索。 
     * @return PackageId 按权益包ID搜索。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 按权益包ID搜索。
     * @param PackageId 按权益包ID搜索。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 按权益包类型搜索。 
     * @return Type 按权益包类型搜索。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 按权益包类型搜索。
     * @param Type 按权益包类型搜索。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 子产品编号 
     * @return Pid 子产品编号
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 子产品编号
     * @param Pid 子产品编号
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    public DescribePackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePackagesRequest(DescribePackagesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Pid", this.Pid);

    }
}

