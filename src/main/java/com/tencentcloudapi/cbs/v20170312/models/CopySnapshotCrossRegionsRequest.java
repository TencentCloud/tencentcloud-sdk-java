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

public class CopySnapshotCrossRegionsRequest extends AbstractModel{

    /**
    * 快照需要复制到的目标地域，各地域的标准取值可通过接口[DescribeRegions](https://cloud.tencent.com/document/product/213/9456)查询，且只能传入支持快照的地域。
    */
    @SerializedName("DestinationRegions")
    @Expose
    private String [] DestinationRegions;

    /**
    * 需要跨地域复制的源快照ID，可通过[DescribeSnapshots](/document/product/362/15647)查询。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 新复制快照的名称，如果不传，则默认取值为“Copied 源快照ID from 地域名”。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
     * Get 快照需要复制到的目标地域，各地域的标准取值可通过接口[DescribeRegions](https://cloud.tencent.com/document/product/213/9456)查询，且只能传入支持快照的地域。 
     * @return DestinationRegions 快照需要复制到的目标地域，各地域的标准取值可通过接口[DescribeRegions](https://cloud.tencent.com/document/product/213/9456)查询，且只能传入支持快照的地域。
     */
    public String [] getDestinationRegions() {
        return this.DestinationRegions;
    }

    /**
     * Set 快照需要复制到的目标地域，各地域的标准取值可通过接口[DescribeRegions](https://cloud.tencent.com/document/product/213/9456)查询，且只能传入支持快照的地域。
     * @param DestinationRegions 快照需要复制到的目标地域，各地域的标准取值可通过接口[DescribeRegions](https://cloud.tencent.com/document/product/213/9456)查询，且只能传入支持快照的地域。
     */
    public void setDestinationRegions(String [] DestinationRegions) {
        this.DestinationRegions = DestinationRegions;
    }

    /**
     * Get 需要跨地域复制的源快照ID，可通过[DescribeSnapshots](/document/product/362/15647)查询。 
     * @return SnapshotId 需要跨地域复制的源快照ID，可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 需要跨地域复制的源快照ID，可通过[DescribeSnapshots](/document/product/362/15647)查询。
     * @param SnapshotId 需要跨地域复制的源快照ID，可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 新复制快照的名称，如果不传，则默认取值为“Copied 源快照ID from 地域名”。 
     * @return SnapshotName 新复制快照的名称，如果不传，则默认取值为“Copied 源快照ID from 地域名”。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 新复制快照的名称，如果不传，则默认取值为“Copied 源快照ID from 地域名”。
     * @param SnapshotName 新复制快照的名称，如果不传，则默认取值为“Copied 源快照ID from 地域名”。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    public CopySnapshotCrossRegionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopySnapshotCrossRegionsRequest(CopySnapshotCrossRegionsRequest source) {
        if (source.DestinationRegions != null) {
            this.DestinationRegions = new String[source.DestinationRegions.length];
            for (int i = 0; i < source.DestinationRegions.length; i++) {
                this.DestinationRegions[i] = new String(source.DestinationRegions[i]);
            }
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DestinationRegions.", this.DestinationRegions);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);

    }
}

