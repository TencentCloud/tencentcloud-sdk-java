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

public class DescribeIdlFileInfosRequest extends AbstractModel{

    /**
    * 文件所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 文件所属表格组ID
    */
    @SerializedName("TableGroupIds")
    @Expose
    private String [] TableGroupIds;

    /**
    * 指定文件ID列表
    */
    @SerializedName("IdlFileIds")
    @Expose
    private String [] IdlFileIds;

    /**
    * 查询列表偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询列表返回记录数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 文件所属集群ID 
     * @return ClusterId 文件所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 文件所属集群ID
     * @param ClusterId 文件所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 文件所属表格组ID 
     * @return TableGroupIds 文件所属表格组ID
     */
    public String [] getTableGroupIds() {
        return this.TableGroupIds;
    }

    /**
     * Set 文件所属表格组ID
     * @param TableGroupIds 文件所属表格组ID
     */
    public void setTableGroupIds(String [] TableGroupIds) {
        this.TableGroupIds = TableGroupIds;
    }

    /**
     * Get 指定文件ID列表 
     * @return IdlFileIds 指定文件ID列表
     */
    public String [] getIdlFileIds() {
        return this.IdlFileIds;
    }

    /**
     * Set 指定文件ID列表
     * @param IdlFileIds 指定文件ID列表
     */
    public void setIdlFileIds(String [] IdlFileIds) {
        this.IdlFileIds = IdlFileIds;
    }

    /**
     * Get 查询列表偏移量 
     * @return Offset 查询列表偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询列表偏移量
     * @param Offset 查询列表偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询列表返回记录数 
     * @return Limit 查询列表返回记录数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询列表返回记录数
     * @param Limit 查询列表返回记录数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "TableGroupIds.", this.TableGroupIds);
        this.setParamArraySimple(map, prefix + "IdlFileIds.", this.IdlFileIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

