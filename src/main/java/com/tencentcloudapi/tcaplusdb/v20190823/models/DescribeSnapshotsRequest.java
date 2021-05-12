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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotsRequest extends AbstractModel{

    /**
    * 表格所属集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 所属表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 快照名称
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
     * Get 表格所属集群id 
     * @return ClusterId 表格所属集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 表格所属集群id
     * @param ClusterId 表格所属集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 所属表格组ID 
     * @return TableGroupId 所属表格组ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 所属表格组ID
     * @param TableGroupId 所属表格组ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表名称 
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 快照名称 
     * @return SnapshotName 快照名称
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称
     * @param SnapshotName 快照名称
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    public DescribeSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotsRequest(DescribeSnapshotsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);

    }
}

