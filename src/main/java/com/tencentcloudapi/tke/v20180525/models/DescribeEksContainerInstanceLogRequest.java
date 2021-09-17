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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEksContainerInstanceLogRequest extends AbstractModel{

    /**
    * Eks Container Instance Id，即容器实例Id
    */
    @SerializedName("EksCiId")
    @Expose
    private String EksCiId;

    /**
    * 容器名称，单容器的实例可选填。如果为多容器实例，请指定容器名称。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 返回最新日志行数，默认500，最大2000。日志内容最大返回 1M 数据。
    */
    @SerializedName("Tail")
    @Expose
    private Long Tail;

    /**
    * UTC时间，RFC3339标准
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 是否是查上一个容器（如果容器退出重启了）
    */
    @SerializedName("Previous")
    @Expose
    private Boolean Previous;

    /**
    * 查询最近多少秒内的日志
    */
    @SerializedName("SinceSeconds")
    @Expose
    private Long SinceSeconds;

    /**
    * 日志总大小限制
    */
    @SerializedName("LimitBytes")
    @Expose
    private Long LimitBytes;

    /**
     * Get Eks Container Instance Id，即容器实例Id 
     * @return EksCiId Eks Container Instance Id，即容器实例Id
     */
    public String getEksCiId() {
        return this.EksCiId;
    }

    /**
     * Set Eks Container Instance Id，即容器实例Id
     * @param EksCiId Eks Container Instance Id，即容器实例Id
     */
    public void setEksCiId(String EksCiId) {
        this.EksCiId = EksCiId;
    }

    /**
     * Get 容器名称，单容器的实例可选填。如果为多容器实例，请指定容器名称。 
     * @return ContainerName 容器名称，单容器的实例可选填。如果为多容器实例，请指定容器名称。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称，单容器的实例可选填。如果为多容器实例，请指定容器名称。
     * @param ContainerName 容器名称，单容器的实例可选填。如果为多容器实例，请指定容器名称。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 返回最新日志行数，默认500，最大2000。日志内容最大返回 1M 数据。 
     * @return Tail 返回最新日志行数，默认500，最大2000。日志内容最大返回 1M 数据。
     */
    public Long getTail() {
        return this.Tail;
    }

    /**
     * Set 返回最新日志行数，默认500，最大2000。日志内容最大返回 1M 数据。
     * @param Tail 返回最新日志行数，默认500，最大2000。日志内容最大返回 1M 数据。
     */
    public void setTail(Long Tail) {
        this.Tail = Tail;
    }

    /**
     * Get UTC时间，RFC3339标准 
     * @return StartTime UTC时间，RFC3339标准
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set UTC时间，RFC3339标准
     * @param StartTime UTC时间，RFC3339标准
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 是否是查上一个容器（如果容器退出重启了） 
     * @return Previous 是否是查上一个容器（如果容器退出重启了）
     */
    public Boolean getPrevious() {
        return this.Previous;
    }

    /**
     * Set 是否是查上一个容器（如果容器退出重启了）
     * @param Previous 是否是查上一个容器（如果容器退出重启了）
     */
    public void setPrevious(Boolean Previous) {
        this.Previous = Previous;
    }

    /**
     * Get 查询最近多少秒内的日志 
     * @return SinceSeconds 查询最近多少秒内的日志
     */
    public Long getSinceSeconds() {
        return this.SinceSeconds;
    }

    /**
     * Set 查询最近多少秒内的日志
     * @param SinceSeconds 查询最近多少秒内的日志
     */
    public void setSinceSeconds(Long SinceSeconds) {
        this.SinceSeconds = SinceSeconds;
    }

    /**
     * Get 日志总大小限制 
     * @return LimitBytes 日志总大小限制
     */
    public Long getLimitBytes() {
        return this.LimitBytes;
    }

    /**
     * Set 日志总大小限制
     * @param LimitBytes 日志总大小限制
     */
    public void setLimitBytes(Long LimitBytes) {
        this.LimitBytes = LimitBytes;
    }

    public DescribeEksContainerInstanceLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEksContainerInstanceLogRequest(DescribeEksContainerInstanceLogRequest source) {
        if (source.EksCiId != null) {
            this.EksCiId = new String(source.EksCiId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.Tail != null) {
            this.Tail = new Long(source.Tail);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Previous != null) {
            this.Previous = new Boolean(source.Previous);
        }
        if (source.SinceSeconds != null) {
            this.SinceSeconds = new Long(source.SinceSeconds);
        }
        if (source.LimitBytes != null) {
            this.LimitBytes = new Long(source.LimitBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EksCiId", this.EksCiId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Tail", this.Tail);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Previous", this.Previous);
        this.setParamSimple(map, prefix + "SinceSeconds", this.SinceSeconds);
        this.setParamSimple(map, prefix + "LimitBytes", this.LimitBytes);

    }
}

