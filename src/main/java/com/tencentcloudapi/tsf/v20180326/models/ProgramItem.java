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
    * 数据项ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)接口查询已创建的数据集或登陆控制台进行查看；也可以通过调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。

    */
    @SerializedName("ProgramItemId")
    @Expose
    private String ProgramItemId;

    /**
    * 资源
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * 数据值列表
    */
    @SerializedName("ValueList")
    @Expose
    private String [] ValueList;

    /**
    * 全选标识，true: 全选；false: 非全选
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * 创建时间，时间戳格式【Long】
    */
    @SerializedName("CreationTime")
    @Expose
    private Long CreationTime;

    /**
    * 最后更新时间，时间戳格式【Long】，单位毫秒
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * 删除标识，true: 可删除；false: 不可删除
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Boolean DeleteFlag;

    /**
    * 数据集ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)查询接口获取
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
     * Get 数据项ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)接口查询已创建的数据集或登陆控制台进行查看；也可以通过调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。
 
     * @return ProgramItemId 数据项ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)接口查询已创建的数据集或登陆控制台进行查看；也可以通过调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。

     */
    public String getProgramItemId() {
        return this.ProgramItemId;
    }

    /**
     * Set 数据项ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)接口查询已创建的数据集或登陆控制台进行查看；也可以通过调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。

     * @param ProgramItemId 数据项ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)接口查询已创建的数据集或登陆控制台进行查看；也可以通过调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。

     */
    public void setProgramItemId(String ProgramItemId) {
        this.ProgramItemId = ProgramItemId;
    }

    /**
     * Get 资源 
     * @return Resource 资源
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set 资源
     * @param Resource 资源
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 数据值列表 
     * @return ValueList 数据值列表
     */
    public String [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set 数据值列表
     * @param ValueList 数据值列表
     */
    public void setValueList(String [] ValueList) {
        this.ValueList = ValueList;
    }

    /**
     * Get 全选标识，true: 全选；false: 非全选 
     * @return IsAll 全选标识，true: 全选；false: 非全选
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set 全选标识，true: 全选；false: 非全选
     * @param IsAll 全选标识，true: 全选；false: 非全选
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get 创建时间，时间戳格式【Long】 
     * @return CreationTime 创建时间，时间戳格式【Long】
     */
    public Long getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间，时间戳格式【Long】
     * @param CreationTime 创建时间，时间戳格式【Long】
     */
    public void setCreationTime(Long CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 最后更新时间，时间戳格式【Long】，单位毫秒 
     * @return LastUpdateTime 最后更新时间，时间戳格式【Long】，单位毫秒
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后更新时间，时间戳格式【Long】，单位毫秒
     * @param LastUpdateTime 最后更新时间，时间戳格式【Long】，单位毫秒
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 删除标识，true: 可删除；false: 不可删除 
     * @return DeleteFlag 删除标识，true: 可删除；false: 不可删除
     */
    public Boolean getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set 删除标识，true: 可删除；false: 不可删除
     * @param DeleteFlag 删除标识，true: 可删除；false: 不可删除
     */
    public void setDeleteFlag(Boolean DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * Get 数据集ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)查询接口获取 
     * @return ProgramId 数据集ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)查询接口获取
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set 数据集ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)查询接口获取
     * @param ProgramId 数据集ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)查询接口获取
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

