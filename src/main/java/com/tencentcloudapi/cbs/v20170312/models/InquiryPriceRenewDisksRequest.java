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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewDisksRequest extends AbstractModel {

    /**
    * <p>云硬盘ID， 通过<a href="/document/product/362/16315">DescribeDisks</a>接口查询。</p>
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。</p>
    */
    @SerializedName("DiskChargePrepaids")
    @Expose
    private DiskChargePrepaid [] DiskChargePrepaids;

    /**
    * <p>指定云硬盘新的到期时间，形式如：2017-12-17 00:00:00。参数<code>NewDeadline</code>和<code>DiskChargePrepaids</code>是两种指定询价时长的方式，两者必传一个。</p>
    */
    @SerializedName("NewDeadline")
    @Expose
    private String NewDeadline;

    /**
    * <p>云硬盘所属项目ID。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 的返回值中的 projectId 字段来获取。 如传入则仅用于鉴权。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get <p>云硬盘ID， 通过<a href="/document/product/362/16315">DescribeDisks</a>接口查询。</p> 
     * @return DiskIds <p>云硬盘ID， 通过<a href="/document/product/362/16315">DescribeDisks</a>接口查询。</p>
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set <p>云硬盘ID， 通过<a href="/document/product/362/16315">DescribeDisks</a>接口查询。</p>
     * @param DiskIds <p>云硬盘ID， 通过<a href="/document/product/362/16315">DescribeDisks</a>接口查询。</p>
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。</p> 
     * @return DiskChargePrepaids <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。</p>
     */
    public DiskChargePrepaid [] getDiskChargePrepaids() {
        return this.DiskChargePrepaids;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。</p>
     * @param DiskChargePrepaids <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。</p>
     */
    public void setDiskChargePrepaids(DiskChargePrepaid [] DiskChargePrepaids) {
        this.DiskChargePrepaids = DiskChargePrepaids;
    }

    /**
     * Get <p>指定云硬盘新的到期时间，形式如：2017-12-17 00:00:00。参数<code>NewDeadline</code>和<code>DiskChargePrepaids</code>是两种指定询价时长的方式，两者必传一个。</p> 
     * @return NewDeadline <p>指定云硬盘新的到期时间，形式如：2017-12-17 00:00:00。参数<code>NewDeadline</code>和<code>DiskChargePrepaids</code>是两种指定询价时长的方式，两者必传一个。</p>
     */
    public String getNewDeadline() {
        return this.NewDeadline;
    }

    /**
     * Set <p>指定云硬盘新的到期时间，形式如：2017-12-17 00:00:00。参数<code>NewDeadline</code>和<code>DiskChargePrepaids</code>是两种指定询价时长的方式，两者必传一个。</p>
     * @param NewDeadline <p>指定云硬盘新的到期时间，形式如：2017-12-17 00:00:00。参数<code>NewDeadline</code>和<code>DiskChargePrepaids</code>是两种指定询价时长的方式，两者必传一个。</p>
     */
    public void setNewDeadline(String NewDeadline) {
        this.NewDeadline = NewDeadline;
    }

    /**
     * Get <p>云硬盘所属项目ID。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 的返回值中的 projectId 字段来获取。 如传入则仅用于鉴权。</p> 
     * @return ProjectId <p>云硬盘所属项目ID。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 的返回值中的 projectId 字段来获取。 如传入则仅用于鉴权。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>云硬盘所属项目ID。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 的返回值中的 projectId 字段来获取。 如传入则仅用于鉴权。</p>
     * @param ProjectId <p>云硬盘所属项目ID。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 的返回值中的 projectId 字段来获取。 如传入则仅用于鉴权。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public InquiryPriceRenewDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewDisksRequest(InquiryPriceRenewDisksRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.DiskChargePrepaids != null) {
            this.DiskChargePrepaids = new DiskChargePrepaid[source.DiskChargePrepaids.length];
            for (int i = 0; i < source.DiskChargePrepaids.length; i++) {
                this.DiskChargePrepaids[i] = new DiskChargePrepaid(source.DiskChargePrepaids[i]);
            }
        }
        if (source.NewDeadline != null) {
            this.NewDeadline = new String(source.NewDeadline);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamArrayObj(map, prefix + "DiskChargePrepaids.", this.DiskChargePrepaids);
        this.setParamSimple(map, prefix + "NewDeadline", this.NewDeadline);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

