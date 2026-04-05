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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProgramItem extends AbstractModel {

    /**
    * <p>数据项ID，调用<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program">DescribePrograms</a>接口查询已创建的数据集或登录控制台进行查看；也可以通过调用<a href="https://cloud.tencent.com/document/api/649/108544">CreateProgram</a>创建新的数据集。</p>
    */
    @SerializedName("ProgramItemId")
    @Expose
    private String ProgramItemId;

    /**
    * <p>资源</p>
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * <p>数据值列表</p>
    */
    @SerializedName("ValueList")
    @Expose
    private String [] ValueList;

    /**
    * <p>全选标识，true: 全选；false: 非全选</p>
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * <p>创建时间，时间戳格式【Long】</p>
    */
    @SerializedName("CreationTime")
    @Expose
    private Long CreationTime;

    /**
    * <p>最后更新时间，时间戳格式【Long】，单位毫秒</p>
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * <p>删除标识，true: 可删除；false: 不可删除</p>
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Boolean DeleteFlag;

    /**
    * <p>数据集ID，调用<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program">DescribePrograms</a>查询接口获取</p>
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
     * Get <p>数据项ID，调用<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program">DescribePrograms</a>接口查询已创建的数据集或登录控制台进行查看；也可以通过调用<a href="https://cloud.tencent.com/document/api/649/108544">CreateProgram</a>创建新的数据集。</p> 
     * @return ProgramItemId <p>数据项ID，调用<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program">DescribePrograms</a>接口查询已创建的数据集或登录控制台进行查看；也可以通过调用<a href="https://cloud.tencent.com/document/api/649/108544">CreateProgram</a>创建新的数据集。</p>
     */
    public String getProgramItemId() {
        return this.ProgramItemId;
    }

    /**
     * Set <p>数据项ID，调用<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program">DescribePrograms</a>接口查询已创建的数据集或登录控制台进行查看；也可以通过调用<a href="https://cloud.tencent.com/document/api/649/108544">CreateProgram</a>创建新的数据集。</p>
     * @param ProgramItemId <p>数据项ID，调用<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program">DescribePrograms</a>接口查询已创建的数据集或登录控制台进行查看；也可以通过调用<a href="https://cloud.tencent.com/document/api/649/108544">CreateProgram</a>创建新的数据集。</p>
     */
    public void setProgramItemId(String ProgramItemId) {
        this.ProgramItemId = ProgramItemId;
    }

    /**
     * Get <p>资源</p> 
     * @return Resource <p>资源</p>
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set <p>资源</p>
     * @param Resource <p>资源</p>
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>数据值列表</p> 
     * @return ValueList <p>数据值列表</p>
     */
    public String [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set <p>数据值列表</p>
     * @param ValueList <p>数据值列表</p>
     */
    public void setValueList(String [] ValueList) {
        this.ValueList = ValueList;
    }

    /**
     * Get <p>全选标识，true: 全选；false: 非全选</p> 
     * @return IsAll <p>全选标识，true: 全选；false: 非全选</p>
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set <p>全选标识，true: 全选；false: 非全选</p>
     * @param IsAll <p>全选标识，true: 全选；false: 非全选</p>
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get <p>创建时间，时间戳格式【Long】</p> 
     * @return CreationTime <p>创建时间，时间戳格式【Long】</p>
     */
    public Long getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <p>创建时间，时间戳格式【Long】</p>
     * @param CreationTime <p>创建时间，时间戳格式【Long】</p>
     */
    public void setCreationTime(Long CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <p>最后更新时间，时间戳格式【Long】，单位毫秒</p> 
     * @return LastUpdateTime <p>最后更新时间，时间戳格式【Long】，单位毫秒</p>
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set <p>最后更新时间，时间戳格式【Long】，单位毫秒</p>
     * @param LastUpdateTime <p>最后更新时间，时间戳格式【Long】，单位毫秒</p>
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get <p>删除标识，true: 可删除；false: 不可删除</p> 
     * @return DeleteFlag <p>删除标识，true: 可删除；false: 不可删除</p>
     */
    public Boolean getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set <p>删除标识，true: 可删除；false: 不可删除</p>
     * @param DeleteFlag <p>删除标识，true: 可删除；false: 不可删除</p>
     */
    public void setDeleteFlag(Boolean DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * Get <p>数据集ID，调用<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program">DescribePrograms</a>查询接口获取</p> 
     * @return ProgramId <p>数据集ID，调用<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program">DescribePrograms</a>查询接口获取</p>
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set <p>数据集ID，调用<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program">DescribePrograms</a>查询接口获取</p>
     * @param ProgramId <p>数据集ID，调用<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program">DescribePrograms</a>查询接口获取</p>
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    public ProgramItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProgramItem(ProgramItem source) {
        if (source.ProgramItemId != null) {
            this.ProgramItemId = new String(source.ProgramItemId);
        }
        if (source.Resource != null) {
            this.Resource = new Resource(source.Resource);
        }
        if (source.ValueList != null) {
            this.ValueList = new String[source.ValueList.length];
            for (int i = 0; i < source.ValueList.length; i++) {
                this.ValueList[i] = new String(source.ValueList[i]);
            }
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new Long(source.CreationTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.DeleteFlag != null) {
            this.DeleteFlag = new Boolean(source.DeleteFlag);
        }
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgramItemId", this.ProgramItemId);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArraySimple(map, prefix + "ValueList.", this.ValueList);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);

    }
}

