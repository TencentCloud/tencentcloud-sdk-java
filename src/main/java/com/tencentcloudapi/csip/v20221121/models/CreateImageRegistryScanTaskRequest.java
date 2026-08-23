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

public class CreateImageRegistryScanTaskRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>扫描类型</p><p>枚举值：</p><ul><li>VUL： 漏洞</li><li>VIRUS： 木马</li><li>RISK： 敏感信息</li></ul>
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * <p>超时时间，单位秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>任务名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>扫描目标镜像过滤配置</p>
    */
    @SerializedName("Target")
    @Expose
    private ImageScanAssetTarget Target;

    /**
    * <p>镜像过滤配置</p>
    */
    @SerializedName("Filter")
    @Expose
    private ImageScanRegistryFilter Filter;

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
     * Get <p>扫描类型</p><p>枚举值：</p><ul><li>VUL： 漏洞</li><li>VIRUS： 木马</li><li>RISK： 敏感信息</li></ul> 
     * @return ScanType <p>扫描类型</p><p>枚举值：</p><ul><li>VUL： 漏洞</li><li>VIRUS： 木马</li><li>RISK： 敏感信息</li></ul>
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>扫描类型</p><p>枚举值：</p><ul><li>VUL： 漏洞</li><li>VIRUS： 木马</li><li>RISK： 敏感信息</li></ul>
     * @param ScanType <p>扫描类型</p><p>枚举值：</p><ul><li>VUL： 漏洞</li><li>VIRUS： 木马</li><li>RISK： 敏感信息</li></ul>
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>超时时间，单位秒</p> 
     * @return Timeout <p>超时时间，单位秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间，单位秒</p>
     * @param Timeout <p>超时时间，单位秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>任务名</p> 
     * @return Name <p>任务名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名</p>
     * @param Name <p>任务名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>扫描目标镜像过滤配置</p> 
     * @return Target <p>扫描目标镜像过滤配置</p>
     */
    public ImageScanAssetTarget getTarget() {
        return this.Target;
    }

    /**
     * Set <p>扫描目标镜像过滤配置</p>
     * @param Target <p>扫描目标镜像过滤配置</p>
     */
    public void setTarget(ImageScanAssetTarget Target) {
        this.Target = Target;
    }

    /**
     * Get <p>镜像过滤配置</p> 
     * @return Filter <p>镜像过滤配置</p>
     */
    public ImageScanRegistryFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>镜像过滤配置</p>
     * @param Filter <p>镜像过滤配置</p>
     */
    public void setFilter(ImageScanRegistryFilter Filter) {
        this.Filter = Filter;
    }

    public CreateImageRegistryScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRegistryScanTaskRequest(CreateImageRegistryScanTaskRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Target != null) {
            this.Target = new ImageScanAssetTarget(source.Target);
        }
        if (source.Filter != null) {
            this.Filter = new ImageScanRegistryFilter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

