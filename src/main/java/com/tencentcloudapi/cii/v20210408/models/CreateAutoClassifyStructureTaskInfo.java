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

public class CreateAutoClassifyStructureTaskInfo extends AbstractModel{

    /**
    * 报告文件上传的地址列表，需按顺序排列。如果使用ImageList参数，置为空数组即可
    */
    @SerializedName("FileList")
    @Expose
    private String [] FileList;

    /**
    * 客户号
    */
    @SerializedName("CustomerId")
    @Expose
    private String CustomerId;

    /**
    * 客户姓名
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * 报告上传的图片内容数组，图片内容采用base64编码，需按顺序排列
    */
    @SerializedName("ImageList")
    @Expose
    private String [] ImageList;

    /**
     * Get 报告文件上传的地址列表，需按顺序排列。如果使用ImageList参数，置为空数组即可 
     * @return FileList 报告文件上传的地址列表，需按顺序排列。如果使用ImageList参数，置为空数组即可
     */
    public String [] getFileList() {
        return this.FileList;
    }

    /**
     * Set 报告文件上传的地址列表，需按顺序排列。如果使用ImageList参数，置为空数组即可
     * @param FileList 报告文件上传的地址列表，需按顺序排列。如果使用ImageList参数，置为空数组即可
     */
    public void setFileList(String [] FileList) {
        this.FileList = FileList;
    }

    /**
     * Get 客户号 
     * @return CustomerId 客户号
     */
    public String getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 客户号
     * @param CustomerId 客户号
     */
    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 客户姓名 
     * @return CustomerName 客户姓名
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 客户姓名
     * @param CustomerName 客户姓名
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get 报告上传的图片内容数组，图片内容采用base64编码，需按顺序排列 
     * @return ImageList 报告上传的图片内容数组，图片内容采用base64编码，需按顺序排列
     */
    public String [] getImageList() {
        return this.ImageList;
    }

    /**
     * Set 报告上传的图片内容数组，图片内容采用base64编码，需按顺序排列
     * @param ImageList 报告上传的图片内容数组，图片内容采用base64编码，需按顺序排列
     */
    public void setImageList(String [] ImageList) {
        this.ImageList = ImageList;
    }

    public CreateAutoClassifyStructureTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoClassifyStructureTaskInfo(CreateAutoClassifyStructureTaskInfo source) {
        if (source.FileList != null) {
            this.FileList = new String[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new String(source.FileList[i]);
            }
        }
        if (source.CustomerId != null) {
            this.CustomerId = new String(source.CustomerId);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.ImageList != null) {
            this.ImageList = new String[source.ImageList.length];
            for (int i = 0; i < source.ImageList.length; i++) {
                this.ImageList[i] = new String(source.ImageList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileList.", this.FileList);
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamArraySimple(map, prefix + "ImageList.", this.ImageList);

    }
}

