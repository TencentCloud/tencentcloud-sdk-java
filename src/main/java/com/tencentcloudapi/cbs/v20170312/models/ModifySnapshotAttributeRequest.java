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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySnapshotAttributeRequest extends AbstractModel {

    /**
    * 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 快照的保留方式，FALSE表示非永久保留，TRUE表示永久保留。
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 新的快照名称。最长为60个字符。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照的到期时间；设置好快照将会被同时设置为非永久保留方式；超过到期时间后快照将会被自动删除。注：该参数仅在参数IsPermanent为False时生效。
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
     * Get 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。 
     * @return SnapshotId 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     * @param SnapshotId 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 快照的保留方式，FALSE表示非永久保留，TRUE表示永久保留。 
     * @return IsPermanent 快照的保留方式，FALSE表示非永久保留，TRUE表示永久保留。
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set 快照的保留方式，FALSE表示非永久保留，TRUE表示永久保留。
     * @param IsPermanent 快照的保留方式，FALSE表示非永久保留，TRUE表示永久保留。
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get 新的快照名称。最长为60个字符。 
     * @return SnapshotName 新的快照名称。最长为60个字符。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 新的快照名称。最长为60个字符。
     * @param SnapshotName 新的快照名称。最长为60个字符。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 快照的到期时间；设置好快照将会被同时设置为非永久保留方式；超过到期时间后快照将会被自动删除。注：该参数仅在参数IsPermanent为False时生效。 
     * @return Deadline 快照的到期时间；设置好快照将会被同时设置为非永久保留方式；超过到期时间后快照将会被自动删除。注：该参数仅在参数IsPermanent为False时生效。
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 快照的到期时间；设置好快照将会被同时设置为非永久保留方式；超过到期时间后快照将会被自动删除。注：该参数仅在参数IsPermanent为False时生效。
     * @param Deadline 快照的到期时间；设置好快照将会被同时设置为非永久保留方式；超过到期时间后快照将会被自动删除。注：该参数仅在参数IsPermanent为False时生效。
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    public ModifySnapshotAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySnapshotAttributeRequest(ModifySnapshotAttributeRequest source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);

    }
}

