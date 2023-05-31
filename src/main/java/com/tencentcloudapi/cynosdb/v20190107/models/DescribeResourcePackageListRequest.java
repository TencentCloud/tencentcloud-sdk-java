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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourcePackageListRequest extends AbstractModel{

    /**
    * 资源包唯一ID
    */
    @SerializedName("PackageId")
    @Expose
    private String [] PackageId;

    /**
    * 资源包名称
    */
    @SerializedName("PackageName")
    @Expose
    private String [] PackageName;

    /**
    * 资源包类型
CCU-计算资源包，DISK-存储资源包
    */
    @SerializedName("PackageType")
    @Expose
    private String [] PackageType;

    /**
    * 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
    */
    @SerializedName("PackageRegion")
    @Expose
    private String [] PackageRegion;

    /**
    * 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 排序条件，支持排序条件:startTime-生效时间，
expireTime-过期时间，packageUsedSpec-使用容量，packageTotalSpec-总存储量。
按照数组顺序排列；
    */
    @SerializedName("OrderBy")
    @Expose
    private String [] OrderBy;

    /**
    * 排序方式，DESC-降序，ASC-升序
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 资源包唯一ID 
     * @return PackageId 资源包唯一ID
     */
    public String [] getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 资源包唯一ID
     * @param PackageId 资源包唯一ID
     */
    public void setPackageId(String [] PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 资源包名称 
     * @return PackageName 资源包名称
     */
    public String [] getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 资源包名称
     * @param PackageName 资源包名称
     */
    public void setPackageName(String [] PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 资源包类型
CCU-计算资源包，DISK-存储资源包 
     * @return PackageType 资源包类型
CCU-计算资源包，DISK-存储资源包
     */
    public String [] getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 资源包类型
CCU-计算资源包，DISK-存储资源包
     * @param PackageType 资源包类型
CCU-计算资源包，DISK-存储资源包
     */
    public void setPackageType(String [] PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用 
     * @return PackageRegion 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
     */
    public String [] getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
     * @param PackageRegion 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
     */
    public void setPackageRegion(String [] PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。 
     * @return Status 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。
     * @param Status 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 排序条件，支持排序条件:startTime-生效时间，
expireTime-过期时间，packageUsedSpec-使用容量，packageTotalSpec-总存储量。
按照数组顺序排列； 
     * @return OrderBy 排序条件，支持排序条件:startTime-生效时间，
expireTime-过期时间，packageUsedSpec-使用容量，packageTotalSpec-总存储量。
按照数组顺序排列；
     */
    public String [] getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序条件，支持排序条件:startTime-生效时间，
expireTime-过期时间，packageUsedSpec-使用容量，packageTotalSpec-总存储量。
按照数组顺序排列；
     * @param OrderBy 排序条件，支持排序条件:startTime-生效时间，
expireTime-过期时间，packageUsedSpec-使用容量，packageTotalSpec-总存储量。
按照数组顺序排列；
     */
    public void setOrderBy(String [] OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，DESC-降序，ASC-升序 
     * @return OrderDirection 排序方式，DESC-降序，ASC-升序
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方式，DESC-降序，ASC-升序
     * @param OrderDirection 排序方式，DESC-降序，ASC-升序
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制 
     * @return Limit 限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制
     * @param Limit 限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeResourcePackageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcePackageListRequest(DescribeResourcePackageListRequest source) {
        if (source.PackageId != null) {
            this.PackageId = new String[source.PackageId.length];
            for (int i = 0; i < source.PackageId.length; i++) {
                this.PackageId[i] = new String(source.PackageId[i]);
            }
        }
        if (source.PackageName != null) {
            this.PackageName = new String[source.PackageName.length];
            for (int i = 0; i < source.PackageName.length; i++) {
                this.PackageName[i] = new String(source.PackageName[i]);
            }
        }
        if (source.PackageType != null) {
            this.PackageType = new String[source.PackageType.length];
            for (int i = 0; i < source.PackageType.length; i++) {
                this.PackageType[i] = new String(source.PackageType[i]);
            }
        }
        if (source.PackageRegion != null) {
            this.PackageRegion = new String[source.PackageRegion.length];
            for (int i = 0; i < source.PackageRegion.length; i++) {
                this.PackageRegion[i] = new String(source.PackageRegion[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String[source.OrderBy.length];
            for (int i = 0; i < source.OrderBy.length; i++) {
                this.OrderBy[i] = new String(source.OrderBy[i]);
            }
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PackageId.", this.PackageId);
        this.setParamArraySimple(map, prefix + "PackageName.", this.PackageName);
        this.setParamArraySimple(map, prefix + "PackageType.", this.PackageType);
        this.setParamArraySimple(map, prefix + "PackageRegion.", this.PackageRegion);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

