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

public class DescribeApplicationsRequest extends AbstractModel{

    /**
    * 集群ID，用于获取指定集群的单据
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 分页，限制当前返回多少条记录，大于等于10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页，从多少条数据开始返回
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 申请单状态，用于过滤，0-待审核 1-已经审核并提交任务 2-已驳回
    */
    @SerializedName("CensorStatus")
    @Expose
    private Long CensorStatus;

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
    * 申请人uin，用于过滤
    */
    @SerializedName("Applicant")
    @Expose
    private String Applicant;

    /**
    * 申请类型，用于过滤，0加表 1删除表 2清理表 3修改表 4表重建 5存储层扩缩容 6接入层扩缩容 7复制表数据 8key回档
    */
    @SerializedName("ApplyType")
    @Expose
    private Long ApplyType;

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
     * Get 分页，限制当前返回多少条记录，大于等于10 
     * @return Limit 分页，限制当前返回多少条记录，大于等于10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页，限制当前返回多少条记录，大于等于10
     * @param Limit 分页，限制当前返回多少条记录，大于等于10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页，从多少条数据开始返回 
     * @return Offset 分页，从多少条数据开始返回
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页，从多少条数据开始返回
     * @param Offset 分页，从多少条数据开始返回
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 申请单状态，用于过滤，0-待审核 1-已经审核并提交任务 2-已驳回 
     * @return CensorStatus 申请单状态，用于过滤，0-待审核 1-已经审核并提交任务 2-已驳回
     */
    public Long getCensorStatus() {
        return this.CensorStatus;
    }

    /**
     * Set 申请单状态，用于过滤，0-待审核 1-已经审核并提交任务 2-已驳回
     * @param CensorStatus 申请单状态，用于过滤，0-待审核 1-已经审核并提交任务 2-已驳回
     */
    public void setCensorStatus(Long CensorStatus) {
        this.CensorStatus = CensorStatus;
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

    /**
     * Get 申请人uin，用于过滤 
     * @return Applicant 申请人uin，用于过滤
     */
    public String getApplicant() {
        return this.Applicant;
    }

    /**
     * Set 申请人uin，用于过滤
     * @param Applicant 申请人uin，用于过滤
     */
    public void setApplicant(String Applicant) {
        this.Applicant = Applicant;
    }

    /**
     * Get 申请类型，用于过滤，0加表 1删除表 2清理表 3修改表 4表重建 5存储层扩缩容 6接入层扩缩容 7复制表数据 8key回档 
     * @return ApplyType 申请类型，用于过滤，0加表 1删除表 2清理表 3修改表 4表重建 5存储层扩缩容 6接入层扩缩容 7复制表数据 8key回档
     */
    public Long getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set 申请类型，用于过滤，0加表 1删除表 2清理表 3修改表 4表重建 5存储层扩缩容 6接入层扩缩容 7复制表数据 8key回档
     * @param ApplyType 申请类型，用于过滤，0加表 1删除表 2清理表 3修改表 4表重建 5存储层扩缩容 6接入层扩缩容 7复制表数据 8key回档
     */
    public void setApplyType(Long ApplyType) {
        this.ApplyType = ApplyType;
    }

    public DescribeApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationsRequest(DescribeApplicationsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CensorStatus != null) {
            this.CensorStatus = new Long(source.CensorStatus);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Applicant != null) {
            this.Applicant = new String(source.Applicant);
        }
        if (source.ApplyType != null) {
            this.ApplyType = new Long(source.ApplyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CensorStatus", this.CensorStatus);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Applicant", this.Applicant);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);

    }
}

