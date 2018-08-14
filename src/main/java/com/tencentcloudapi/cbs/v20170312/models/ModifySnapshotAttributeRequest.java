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

public class ModifySnapshotAttributeRequest  extends AbstractModel{

    /**
    * 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 新的快照名称。最长为60个字符。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照的保留时间，FALSE表示非永久保留，TRUE表示永久保留。仅支持将非永久快照修改为永久快照。
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
     * 获取快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     * @return SnapshotId 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * 设置快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     * @param SnapshotId 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * 获取新的快照名称。最长为60个字符。
     * @return SnapshotName 新的快照名称。最长为60个字符。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * 设置新的快照名称。最长为60个字符。
     * @param SnapshotName 新的快照名称。最长为60个字符。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * 获取快照的保留时间，FALSE表示非永久保留，TRUE表示永久保留。仅支持将非永久快照修改为永久快照。
     * @return IsPermanent 快照的保留时间，FALSE表示非永久保留，TRUE表示永久保留。仅支持将非永久快照修改为永久快照。
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * 设置快照的保留时间，FALSE表示非永久保留，TRUE表示永久保留。仅支持将非永久快照修改为永久快照。
     * @param IsPermanent 快照的保留时间，FALSE表示非永久保留，TRUE表示永久保留。仅支持将非永久快照修改为永久快照。
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);

    }
}

