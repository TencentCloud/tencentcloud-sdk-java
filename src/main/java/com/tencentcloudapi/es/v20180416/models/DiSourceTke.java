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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiSourceTke extends AbstractModel {

    /**
    * 数据源所属vpc id，创建后不允许修改
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * tke实例id，创建后不允许修改
    */
    @SerializedName("TkeId")
    @Expose
    private String TkeId;

    /**
    * tke包含的命名空间
    */
    @SerializedName("IncludeNamespaces")
    @Expose
    private String [] IncludeNamespaces;

    /**
    * tke不包含的命名空间
    */
    @SerializedName("ExcludeNamespaces")
    @Expose
    private String [] ExcludeNamespaces;

    /**
    * tke容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * tke日志内容过滤
    */
    @SerializedName("LogFilters")
    @Expose
    private String LogFilters;

    /**
    * tke beats配置项
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * tke pod标签
    */
    @SerializedName("PodLabel")
    @Expose
    private DiSourceTkePodLabel [] PodLabel;

    /**
    * /
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * tke 日志采集路径
    */
    @SerializedName("InputPath")
    @Expose
    private String InputPath;

    /**
     * Get 数据源所属vpc id，创建后不允许修改 
     * @return VpcId 数据源所属vpc id，创建后不允许修改
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 数据源所属vpc id，创建后不允许修改
     * @param VpcId 数据源所属vpc id，创建后不允许修改
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get tke实例id，创建后不允许修改 
     * @return TkeId tke实例id，创建后不允许修改
     */
    public String getTkeId() {
        return this.TkeId;
    }

    /**
     * Set tke实例id，创建后不允许修改
     * @param TkeId tke实例id，创建后不允许修改
     */
    public void setTkeId(String TkeId) {
        this.TkeId = TkeId;
    }

    /**
     * Get tke包含的命名空间 
     * @return IncludeNamespaces tke包含的命名空间
     */
    public String [] getIncludeNamespaces() {
        return this.IncludeNamespaces;
    }

    /**
     * Set tke包含的命名空间
     * @param IncludeNamespaces tke包含的命名空间
     */
    public void setIncludeNamespaces(String [] IncludeNamespaces) {
        this.IncludeNamespaces = IncludeNamespaces;
    }

    /**
     * Get tke不包含的命名空间 
     * @return ExcludeNamespaces tke不包含的命名空间
     */
    public String [] getExcludeNamespaces() {
        return this.ExcludeNamespaces;
    }

    /**
     * Set tke不包含的命名空间
     * @param ExcludeNamespaces tke不包含的命名空间
     */
    public void setExcludeNamespaces(String [] ExcludeNamespaces) {
        this.ExcludeNamespaces = ExcludeNamespaces;
    }

    /**
     * Get tke容器名称 
     * @return ContainerName tke容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set tke容器名称
     * @param ContainerName tke容器名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get tke日志内容过滤 
     * @return LogFilters tke日志内容过滤
     */
    public String getLogFilters() {
        return this.LogFilters;
    }

    /**
     * Set tke日志内容过滤
     * @param LogFilters tke日志内容过滤
     */
    public void setLogFilters(String LogFilters) {
        this.LogFilters = LogFilters;
    }

    /**
     * Get tke beats配置项 
     * @return ConfigContent tke beats配置项
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set tke beats配置项
     * @param ConfigContent tke beats配置项
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get tke pod标签 
     * @return PodLabel tke pod标签
     */
    public DiSourceTkePodLabel [] getPodLabel() {
        return this.PodLabel;
    }

    /**
     * Set tke pod标签
     * @param PodLabel tke pod标签
     */
    public void setPodLabel(DiSourceTkePodLabel [] PodLabel) {
        this.PodLabel = PodLabel;
    }

    /**
     * Get / 
     * @return InputType /
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set /
     * @param InputType /
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get tke 日志采集路径 
     * @return InputPath tke 日志采集路径
     */
    public String getInputPath() {
        return this.InputPath;
    }

    /**
     * Set tke 日志采集路径
     * @param InputPath tke 日志采集路径
     */
    public void setInputPath(String InputPath) {
        this.InputPath = InputPath;
    }

    public DiSourceTke() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiSourceTke(DiSourceTke source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.TkeId != null) {
            this.TkeId = new String(source.TkeId);
        }
        if (source.IncludeNamespaces != null) {
            this.IncludeNamespaces = new String[source.IncludeNamespaces.length];
            for (int i = 0; i < source.IncludeNamespaces.length; i++) {
                this.IncludeNamespaces[i] = new String(source.IncludeNamespaces[i]);
            }
        }
        if (source.ExcludeNamespaces != null) {
            this.ExcludeNamespaces = new String[source.ExcludeNamespaces.length];
            for (int i = 0; i < source.ExcludeNamespaces.length; i++) {
                this.ExcludeNamespaces[i] = new String(source.ExcludeNamespaces[i]);
            }
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.LogFilters != null) {
            this.LogFilters = new String(source.LogFilters);
        }
        if (source.ConfigContent != null) {
            this.ConfigContent = new String(source.ConfigContent);
        }
        if (source.PodLabel != null) {
            this.PodLabel = new DiSourceTkePodLabel[source.PodLabel.length];
            for (int i = 0; i < source.PodLabel.length; i++) {
                this.PodLabel[i] = new DiSourceTkePodLabel(source.PodLabel[i]);
            }
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.InputPath != null) {
            this.InputPath = new String(source.InputPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TkeId", this.TkeId);
        this.setParamArraySimple(map, prefix + "IncludeNamespaces.", this.IncludeNamespaces);
        this.setParamArraySimple(map, prefix + "ExcludeNamespaces.", this.ExcludeNamespaces);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "LogFilters", this.LogFilters);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);
        this.setParamArrayObj(map, prefix + "PodLabel.", this.PodLabel);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "InputPath", this.InputPath);

    }
}

