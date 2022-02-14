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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReportClassifyRequest extends AbstractModel{

    /**
    * 服务类型
Structured 仅结构化
Underwrite 结构化+核保
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 文件地址数组
    */
    @SerializedName("FileList")
    @Expose
    private String [] FileList;

    /**
     * Get 服务类型
Structured 仅结构化
Underwrite 结构化+核保 
     * @return ServiceType 服务类型
Structured 仅结构化
Underwrite 结构化+核保
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 服务类型
Structured 仅结构化
Underwrite 结构化+核保
     * @param ServiceType 服务类型
Structured 仅结构化
Underwrite 结构化+核保
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 文件地址数组 
     * @return FileList 文件地址数组
     */
    public String [] getFileList() {
        return this.FileList;
    }

    /**
     * Set 文件地址数组
     * @param FileList 文件地址数组
     */
    public void setFileList(String [] FileList) {
        this.FileList = FileList;
    }

    public DescribeReportClassifyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReportClassifyRequest(DescribeReportClassifyRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.FileList != null) {
            this.FileList = new String[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new String(source.FileList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamArraySimple(map, prefix + "FileList.", this.FileList);

    }
}

