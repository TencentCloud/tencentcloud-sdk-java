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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewDisksRequest  extends AbstractModel{

    /**
    * 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。
    */
    @SerializedName("DiskChargePrepaids")
    @Expose
    private DiskChargePrepaid [] DiskChargePrepaids;

    /**
    * 指定云盘新的到期时间，形式如：2017-12-17 00:00:00。参数`NewDeadline`和`DiskChargePrepaids`是两种指定询价时长的方式，两者必传一个。
    */
    @SerializedName("NewDeadline")
    @Expose
    private String NewDeadline;

    /**
    * 云盘所属项目ID。 如传入则仅用于鉴权。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
     * 获取云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     * @return DiskIds 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * 设置云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     * @param DiskIds 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * 获取预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。
     * @return DiskChargePrepaids 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。
     */
    public DiskChargePrepaid [] getDiskChargePrepaids() {
        return this.DiskChargePrepaids;
    }

    /**
     * 设置预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。
     * @param DiskChargePrepaids 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。
     */
    public void setDiskChargePrepaids(DiskChargePrepaid [] DiskChargePrepaids) {
        this.DiskChargePrepaids = DiskChargePrepaids;
    }

    /**
     * 获取指定云盘新的到期时间，形式如：2017-12-17 00:00:00。参数`NewDeadline`和`DiskChargePrepaids`是两种指定询价时长的方式，两者必传一个。
     * @return NewDeadline 指定云盘新的到期时间，形式如：2017-12-17 00:00:00。参数`NewDeadline`和`DiskChargePrepaids`是两种指定询价时长的方式，两者必传一个。
     */
    public String getNewDeadline() {
        return this.NewDeadline;
    }

    /**
     * 设置指定云盘新的到期时间，形式如：2017-12-17 00:00:00。参数`NewDeadline`和`DiskChargePrepaids`是两种指定询价时长的方式，两者必传一个。
     * @param NewDeadline 指定云盘新的到期时间，形式如：2017-12-17 00:00:00。参数`NewDeadline`和`DiskChargePrepaids`是两种指定询价时长的方式，两者必传一个。
     */
    public void setNewDeadline(String NewDeadline) {
        this.NewDeadline = NewDeadline;
    }

    /**
     * 获取云盘所属项目ID。 如传入则仅用于鉴权。
     * @return ProjectId 云盘所属项目ID。 如传入则仅用于鉴权。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置云盘所属项目ID。 如传入则仅用于鉴权。
     * @param ProjectId 云盘所属项目ID。 如传入则仅用于鉴权。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamArrayObj(map, prefix + "DiskChargePrepaids.", this.DiskChargePrepaids);
        this.setParamSimple(map, prefix + "NewDeadline", this.NewDeadline);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

