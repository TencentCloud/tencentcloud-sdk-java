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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHostImageListExportJobRequest extends AbstractModel {

    /**
    * <p>集群CA证书MD5（32位十六进制，必填）</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>通用ListFilter结构（含Filters数组 + ListFindOption分页）<br>支持的过滤字段：Host / ImageId / ImageName / HasRunningContainer</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>导出字段列表（不传则导出全部字段）<br>枚举值：<br>ImageId：镜像ID<br>ImageName：镜像名<br>ImageVersion：镜像版本<br>ContainerCount：关联容器数<br>HostCount：关联主机数<br>CreateTime：创建时间<br>NickName：所属账号昵称（单账号模式下自动排除）<br>ScanStatus：扫描状态<br>LastScanTime：最近扫描完成时间<br>VulCountCritical：critical级别漏洞数<br>VulCountHigh：high级别漏洞数<br>VulCountMedium：medium级别漏洞数<br>VulCountLow：low级别漏洞数<br>VirusCountCritical：critical级别木马数<br>VirusCountHigh：high级别木马数<br>VirusCountMedium：medium级别木马数<br>VirusCountLow：low级别木马数<br>SensitiveCountCritical：critical级别敏感信息数<br>SensitiveCountHigh：high级别敏感信息数<br>SensitiveCountMedium：medium级别敏感信息数<br>SensitiveCountLow：low级别敏感信息数</p>
    */
    @SerializedName("ExportFields")
    @Expose
    private String [] ExportFields;

    /**
     * Get <p>集群CA证书MD5（32位十六进制，必填）</p> 
     * @return ClusterCaMD5 <p>集群CA证书MD5（32位十六进制，必填）</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>集群CA证书MD5（32位十六进制，必填）</p>
     * @param ClusterCaMD5 <p>集群CA证书MD5（32位十六进制，必填）</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>通用ListFilter结构（含Filters数组 + ListFindOption分页）<br>支持的过滤字段：Host / ImageId / ImageName / HasRunningContainer</p> 
     * @return Filter <p>通用ListFilter结构（含Filters数组 + ListFindOption分页）<br>支持的过滤字段：Host / ImageId / ImageName / HasRunningContainer</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>通用ListFilter结构（含Filters数组 + ListFindOption分页）<br>支持的过滤字段：Host / ImageId / ImageName / HasRunningContainer</p>
     * @param Filter <p>通用ListFilter结构（含Filters数组 + ListFindOption分页）<br>支持的过滤字段：Host / ImageId / ImageName / HasRunningContainer</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>导出字段列表（不传则导出全部字段）<br>枚举值：<br>ImageId：镜像ID<br>ImageName：镜像名<br>ImageVersion：镜像版本<br>ContainerCount：关联容器数<br>HostCount：关联主机数<br>CreateTime：创建时间<br>NickName：所属账号昵称（单账号模式下自动排除）<br>ScanStatus：扫描状态<br>LastScanTime：最近扫描完成时间<br>VulCountCritical：critical级别漏洞数<br>VulCountHigh：high级别漏洞数<br>VulCountMedium：medium级别漏洞数<br>VulCountLow：low级别漏洞数<br>VirusCountCritical：critical级别木马数<br>VirusCountHigh：high级别木马数<br>VirusCountMedium：medium级别木马数<br>VirusCountLow：low级别木马数<br>SensitiveCountCritical：critical级别敏感信息数<br>SensitiveCountHigh：high级别敏感信息数<br>SensitiveCountMedium：medium级别敏感信息数<br>SensitiveCountLow：low级别敏感信息数</p> 
     * @return ExportFields <p>导出字段列表（不传则导出全部字段）<br>枚举值：<br>ImageId：镜像ID<br>ImageName：镜像名<br>ImageVersion：镜像版本<br>ContainerCount：关联容器数<br>HostCount：关联主机数<br>CreateTime：创建时间<br>NickName：所属账号昵称（单账号模式下自动排除）<br>ScanStatus：扫描状态<br>LastScanTime：最近扫描完成时间<br>VulCountCritical：critical级别漏洞数<br>VulCountHigh：high级别漏洞数<br>VulCountMedium：medium级别漏洞数<br>VulCountLow：low级别漏洞数<br>VirusCountCritical：critical级别木马数<br>VirusCountHigh：high级别木马数<br>VirusCountMedium：medium级别木马数<br>VirusCountLow：low级别木马数<br>SensitiveCountCritical：critical级别敏感信息数<br>SensitiveCountHigh：high级别敏感信息数<br>SensitiveCountMedium：medium级别敏感信息数<br>SensitiveCountLow：low级别敏感信息数</p>
     */
    public String [] getExportFields() {
        return this.ExportFields;
    }

    /**
     * Set <p>导出字段列表（不传则导出全部字段）<br>枚举值：<br>ImageId：镜像ID<br>ImageName：镜像名<br>ImageVersion：镜像版本<br>ContainerCount：关联容器数<br>HostCount：关联主机数<br>CreateTime：创建时间<br>NickName：所属账号昵称（单账号模式下自动排除）<br>ScanStatus：扫描状态<br>LastScanTime：最近扫描完成时间<br>VulCountCritical：critical级别漏洞数<br>VulCountHigh：high级别漏洞数<br>VulCountMedium：medium级别漏洞数<br>VulCountLow：low级别漏洞数<br>VirusCountCritical：critical级别木马数<br>VirusCountHigh：high级别木马数<br>VirusCountMedium：medium级别木马数<br>VirusCountLow：low级别木马数<br>SensitiveCountCritical：critical级别敏感信息数<br>SensitiveCountHigh：high级别敏感信息数<br>SensitiveCountMedium：medium级别敏感信息数<br>SensitiveCountLow：low级别敏感信息数</p>
     * @param ExportFields <p>导出字段列表（不传则导出全部字段）<br>枚举值：<br>ImageId：镜像ID<br>ImageName：镜像名<br>ImageVersion：镜像版本<br>ContainerCount：关联容器数<br>HostCount：关联主机数<br>CreateTime：创建时间<br>NickName：所属账号昵称（单账号模式下自动排除）<br>ScanStatus：扫描状态<br>LastScanTime：最近扫描完成时间<br>VulCountCritical：critical级别漏洞数<br>VulCountHigh：high级别漏洞数<br>VulCountMedium：medium级别漏洞数<br>VulCountLow：low级别漏洞数<br>VirusCountCritical：critical级别木马数<br>VirusCountHigh：high级别木马数<br>VirusCountMedium：medium级别木马数<br>VirusCountLow：low级别木马数<br>SensitiveCountCritical：critical级别敏感信息数<br>SensitiveCountHigh：high级别敏感信息数<br>SensitiveCountMedium：medium级别敏感信息数<br>SensitiveCountLow：low级别敏感信息数</p>
     */
    public void setExportFields(String [] ExportFields) {
        this.ExportFields = ExportFields;
    }

    public CreateHostImageListExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHostImageListExportJobRequest(CreateHostImageListExportJobRequest source) {
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.ExportFields != null) {
            this.ExportFields = new String[source.ExportFields.length];
            for (int i = 0; i < source.ExportFields.length; i++) {
                this.ExportFields[i] = new String(source.ExportFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "ExportFields.", this.ExportFields);

    }
}

