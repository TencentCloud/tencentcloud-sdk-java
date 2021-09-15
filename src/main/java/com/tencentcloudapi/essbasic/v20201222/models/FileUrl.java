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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileUrl extends AbstractModel{

    /**
    * 下载文件的URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 下载文件的附加信息
    */
    @SerializedName("Option")
    @Expose
    private String Option;

    /**
    * 下载文件所属的资源序号
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 目录业务下，文件对应的流程
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
     * Get 下载文件的URL 
     * @return Url 下载文件的URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 下载文件的URL
     * @param Url 下载文件的URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 下载文件的附加信息 
     * @return Option 下载文件的附加信息
     */
    public String getOption() {
        return this.Option;
    }

    /**
     * Set 下载文件的附加信息
     * @param Option 下载文件的附加信息
     */
    public void setOption(String Option) {
        this.Option = Option;
    }

    /**
     * Get 下载文件所属的资源序号 
     * @return Index 下载文件所属的资源序号
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 下载文件所属的资源序号
     * @param Index 下载文件所属的资源序号
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 目录业务下，文件对应的流程 
     * @return FlowId 目录业务下，文件对应的流程
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 目录业务下，文件对应的流程
     * @param FlowId 目录业务下，文件对应的流程
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    public FileUrl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileUrl(FileUrl source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Option != null) {
            this.Option = new String(source.Option);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Option", this.Option);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

