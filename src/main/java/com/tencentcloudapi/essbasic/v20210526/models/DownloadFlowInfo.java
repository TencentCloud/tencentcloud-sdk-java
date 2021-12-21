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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadFlowInfo extends AbstractModel{

    /**
    * 文件夹名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 合同（流程）的标识数组
    */
    @SerializedName("FlowIdList")
    @Expose
    private String [] FlowIdList;

    /**
     * Get 文件夹名称 
     * @return FileName 文件夹名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件夹名称
     * @param FileName 文件夹名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 合同（流程）的标识数组 
     * @return FlowIdList 合同（流程）的标识数组
     */
    public String [] getFlowIdList() {
        return this.FlowIdList;
    }

    /**
     * Set 合同（流程）的标识数组
     * @param FlowIdList 合同（流程）的标识数组
     */
    public void setFlowIdList(String [] FlowIdList) {
        this.FlowIdList = FlowIdList;
    }

    public DownloadFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadFlowInfo(DownloadFlowInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FlowIdList != null) {
            this.FlowIdList = new String[source.FlowIdList.length];
            for (int i = 0; i < source.FlowIdList.length; i++) {
                this.FlowIdList[i] = new String(source.FlowIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArraySimple(map, prefix + "FlowIdList.", this.FlowIdList);

    }
}

