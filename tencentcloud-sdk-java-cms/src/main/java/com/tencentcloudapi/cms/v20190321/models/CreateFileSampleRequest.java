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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFileSampleRequest extends AbstractModel{

    /**
    * 文件类型结构数组
    */
    @SerializedName("Contents")
    @Expose
    private FileSample [] Contents;

    /**
    * 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
20105：广告引流
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * image：图片
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 样本类型
1：黑库
2：白库
    */
    @SerializedName("Label")
    @Expose
    private Long Label;

    /**
     * Get 文件类型结构数组 
     * @return Contents 文件类型结构数组
     */
    public FileSample [] getContents() {
        return this.Contents;
    }

    /**
     * Set 文件类型结构数组
     * @param Contents 文件类型结构数组
     */
    public void setContents(FileSample [] Contents) {
        this.Contents = Contents;
    }

    /**
     * Get 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
20105：广告引流 
     * @return EvilType 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
20105：广告引流
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
20105：广告引流
     * @param EvilType 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
20105：广告引流
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get image：图片 
     * @return FileType image：图片
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set image：图片
     * @param FileType image：图片
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 样本类型
1：黑库
2：白库 
     * @return Label 样本类型
1：黑库
2：白库
     */
    public Long getLabel() {
        return this.Label;
    }

    /**
     * Set 样本类型
1：黑库
2：白库
     * @param Label 样本类型
1：黑库
2：白库
     */
    public void setLabel(Long Label) {
        this.Label = Label;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

