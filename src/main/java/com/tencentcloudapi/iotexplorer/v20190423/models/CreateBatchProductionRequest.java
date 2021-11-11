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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBatchProductionRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 烧录方式，0为直接烧录，1为动态注册。
    */
    @SerializedName("BurnMethod")
    @Expose
    private Long BurnMethod;

    /**
    * 生成方式，0为系统生成，1为文件上传。
    */
    @SerializedName("GenerationMethod")
    @Expose
    private Long GenerationMethod;

    /**
    * 文件上传URL，用于文件上传时填写。
    */
    @SerializedName("UploadUrl")
    @Expose
    private String UploadUrl;

    /**
    * 量产数量，用于系统生成时填写。
    */
    @SerializedName("BatchCnt")
    @Expose
    private Long BatchCnt;

    /**
    * 是否生成二维码,0为不生成，1为生成。
    */
    @SerializedName("GenerationQRCode")
    @Expose
    private Long GenerationQRCode;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 烧录方式，0为直接烧录，1为动态注册。 
     * @return BurnMethod 烧录方式，0为直接烧录，1为动态注册。
     */
    public Long getBurnMethod() {
        return this.BurnMethod;
    }

    /**
     * Set 烧录方式，0为直接烧录，1为动态注册。
     * @param BurnMethod 烧录方式，0为直接烧录，1为动态注册。
     */
    public void setBurnMethod(Long BurnMethod) {
        this.BurnMethod = BurnMethod;
    }

    /**
     * Get 生成方式，0为系统生成，1为文件上传。 
     * @return GenerationMethod 生成方式，0为系统生成，1为文件上传。
     */
    public Long getGenerationMethod() {
        return this.GenerationMethod;
    }

    /**
     * Set 生成方式，0为系统生成，1为文件上传。
     * @param GenerationMethod 生成方式，0为系统生成，1为文件上传。
     */
    public void setGenerationMethod(Long GenerationMethod) {
        this.GenerationMethod = GenerationMethod;
    }

    /**
     * Get 文件上传URL，用于文件上传时填写。 
     * @return UploadUrl 文件上传URL，用于文件上传时填写。
     */
    public String getUploadUrl() {
        return this.UploadUrl;
    }

    /**
     * Set 文件上传URL，用于文件上传时填写。
     * @param UploadUrl 文件上传URL，用于文件上传时填写。
     */
    public void setUploadUrl(String UploadUrl) {
        this.UploadUrl = UploadUrl;
    }

    /**
     * Get 量产数量，用于系统生成时填写。 
     * @return BatchCnt 量产数量，用于系统生成时填写。
     */
    public Long getBatchCnt() {
        return this.BatchCnt;
    }

    /**
     * Set 量产数量，用于系统生成时填写。
     * @param BatchCnt 量产数量，用于系统生成时填写。
     */
    public void setBatchCnt(Long BatchCnt) {
        this.BatchCnt = BatchCnt;
    }

    /**
     * Get 是否生成二维码,0为不生成，1为生成。 
     * @return GenerationQRCode 是否生成二维码,0为不生成，1为生成。
     */
    public Long getGenerationQRCode() {
        return this.GenerationQRCode;
    }

    /**
     * Set 是否生成二维码,0为不生成，1为生成。
     * @param GenerationQRCode 是否生成二维码,0为不生成，1为生成。
     */
    public void setGenerationQRCode(Long GenerationQRCode) {
        this.GenerationQRCode = GenerationQRCode;
    }

    public CreateBatchProductionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchProductionRequest(CreateBatchProductionRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.BurnMethod != null) {
            this.BurnMethod = new Long(source.BurnMethod);
        }
        if (source.GenerationMethod != null) {
            this.GenerationMethod = new Long(source.GenerationMethod);
        }
        if (source.UploadUrl != null) {
            this.UploadUrl = new String(source.UploadUrl);
        }
        if (source.BatchCnt != null) {
            this.BatchCnt = new Long(source.BatchCnt);
        }
        if (source.GenerationQRCode != null) {
            this.GenerationQRCode = new Long(source.GenerationQRCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "BurnMethod", this.BurnMethod);
        this.setParamSimple(map, prefix + "GenerationMethod", this.GenerationMethod);
        this.setParamSimple(map, prefix + "UploadUrl", this.UploadUrl);
        this.setParamSimple(map, prefix + "BatchCnt", this.BatchCnt);
        this.setParamSimple(map, prefix + "GenerationQRCode", this.GenerationQRCode);

    }
}

