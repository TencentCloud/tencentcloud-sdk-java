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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveCustomFunctionRequest extends AbstractModel{

    /**
    * 函数唯一标识
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 分类：窗口函数、聚合函数、日期函数......
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 集群引擎实例
    */
    @SerializedName("ClusterIdentifier")
    @Expose
    private String ClusterIdentifier;

    /**
    * 类名
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 资源列表
    */
    @SerializedName("ResourceList")
    @Expose
    private FunctionResource [] ResourceList;

    /**
    * 函数说明
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用法
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * 参数说明
    */
    @SerializedName("ParamDesc")
    @Expose
    private String ParamDesc;

    /**
    * 返回值说明
    */
    @SerializedName("ReturnDesc")
    @Expose
    private String ReturnDesc;

    /**
    * 示例
    */
    @SerializedName("Example")
    @Expose
    private String Example;

    /**
     * Get 函数唯一标识 
     * @return FunctionId 函数唯一标识
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数唯一标识
     * @param FunctionId 函数唯一标识
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 分类：窗口函数、聚合函数、日期函数...... 
     * @return Kind 分类：窗口函数、聚合函数、日期函数......
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 分类：窗口函数、聚合函数、日期函数......
     * @param Kind 分类：窗口函数、聚合函数、日期函数......
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 集群引擎实例 
     * @return ClusterIdentifier 集群引擎实例
     */
    public String getClusterIdentifier() {
        return this.ClusterIdentifier;
    }

    /**
     * Set 集群引擎实例
     * @param ClusterIdentifier 集群引擎实例
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
        this.ClusterIdentifier = ClusterIdentifier;
    }

    /**
     * Get 类名 
     * @return ClassName 类名
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 类名
     * @param ClassName 类名
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get 资源列表 
     * @return ResourceList 资源列表
     */
    public FunctionResource [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set 资源列表
     * @param ResourceList 资源列表
     */
    public void setResourceList(FunctionResource [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    /**
     * Get 函数说明 
     * @return Description 函数说明
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 函数说明
     * @param Description 函数说明
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用法 
     * @return Usage 用法
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set 用法
     * @param Usage 用法
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 参数说明 
     * @return ParamDesc 参数说明
     */
    public String getParamDesc() {
        return this.ParamDesc;
    }

    /**
     * Set 参数说明
     * @param ParamDesc 参数说明
     */
    public void setParamDesc(String ParamDesc) {
        this.ParamDesc = ParamDesc;
    }

    /**
     * Get 返回值说明 
     * @return ReturnDesc 返回值说明
     */
    public String getReturnDesc() {
        return this.ReturnDesc;
    }

    /**
     * Set 返回值说明
     * @param ReturnDesc 返回值说明
     */
    public void setReturnDesc(String ReturnDesc) {
        this.ReturnDesc = ReturnDesc;
    }

    /**
     * Get 示例 
     * @return Example 示例
     */
    public String getExample() {
        return this.Example;
    }

    /**
     * Set 示例
     * @param Example 示例
     */
    public void setExample(String Example) {
        this.Example = Example;
    }

    public SaveCustomFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveCustomFunctionRequest(SaveCustomFunctionRequest source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.ClusterIdentifier != null) {
            this.ClusterIdentifier = new String(source.ClusterIdentifier);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.ResourceList != null) {
            this.ResourceList = new FunctionResource[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new FunctionResource(source.ResourceList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.ParamDesc != null) {
            this.ParamDesc = new String(source.ParamDesc);
        }
        if (source.ReturnDesc != null) {
            this.ReturnDesc = new String(source.ReturnDesc);
        }
        if (source.Example != null) {
            this.Example = new String(source.Example);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "ClusterIdentifier", this.ClusterIdentifier);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamArrayObj(map, prefix + "ResourceList.", this.ResourceList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "ParamDesc", this.ParamDesc);
        this.setParamSimple(map, prefix + "ReturnDesc", this.ReturnDesc);
        this.setParamSimple(map, prefix + "Example", this.Example);

    }
}

