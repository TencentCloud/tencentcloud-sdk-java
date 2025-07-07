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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupRecordsRequest extends AbstractModel {

    /**
    * 集群ID，用于获取指定集群的单据
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 分页
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 表格组id，用于过滤
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表格名，用于过滤
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get 集群ID，用于获取指定集群的单据 
     * @return ClusterId 集群ID，用于获取指定集群的单据
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，用于获取指定集群的单据
     * @param ClusterId 集群ID，用于获取指定集群的单据
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 分页 
     * @return Limit 分页
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页
     * @param Limit 分页
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页 
     * @return Offset 分页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页
     * @param Offset 分页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 表格组id，用于过滤 
     * @return TableGroupId 表格组id，用于过滤
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格组id，用于过滤
     * @param TableGroupId 表格组id，用于过滤
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表格名，用于过滤 
     * @return TableName 表格名，用于过滤
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表格名，用于过滤
     * @param TableName 表格名，用于过滤
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeBackupRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupRecordsRequest(DescribeBackupRecordsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

