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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MarkEssaySuggestions extends AbstractModel {

    /**
    * 作文批改序号
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 批改类型：主要包括：词汇、语句
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 子类型，基于Type返回二级类型

词汇： 错别字、使用拼音、词语误用、词语冗余、词汇贫乏、多字/漏字

语句：语法硬伤、逻辑问题、表达不佳、标点误用、优美句子
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 原文内容
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 批改后的内容
    */
    @SerializedName("Replace")
    @Expose
    private String Replace;

    /**
    * 点评内容
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * array[][]二维数组，原文内容可能存在跨行的句子，会有多组坐标返回

切图区域的4个角点坐标, 是个长度为8的数组

[0,1,2,3,4,5,6,7]

(0,1) 左上角坐标
(2,3) 右上角坐标
(4,5) 右下角坐标
(6,7) 左下角坐标
    */
    @SerializedName("Positions")
    @Expose
    private Positions [] Positions;

    /**
     * Get 作文批改序号 
     * @return ID 作文批改序号
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 作文批改序号
     * @param ID 作文批改序号
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 批改类型：主要包括：词汇、语句 
     * @return Type 批改类型：主要包括：词汇、语句
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 批改类型：主要包括：词汇、语句
     * @param Type 批改类型：主要包括：词汇、语句
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 子类型，基于Type返回二级类型

词汇： 错别字、使用拼音、词语误用、词语冗余、词汇贫乏、多字/漏字

语句：语法硬伤、逻辑问题、表达不佳、标点误用、优美句子 
     * @return SubType 子类型，基于Type返回二级类型

词汇： 错别字、使用拼音、词语误用、词语冗余、词汇贫乏、多字/漏字

语句：语法硬伤、逻辑问题、表达不佳、标点误用、优美句子
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 子类型，基于Type返回二级类型

词汇： 错别字、使用拼音、词语误用、词语冗余、词汇贫乏、多字/漏字

语句：语法硬伤、逻辑问题、表达不佳、标点误用、优美句子
     * @param SubType 子类型，基于Type返回二级类型

词汇： 错别字、使用拼音、词语误用、词语冗余、词汇贫乏、多字/漏字

语句：语法硬伤、逻辑问题、表达不佳、标点误用、优美句子
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 原文内容 
     * @return Origin 原文内容
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 原文内容
     * @param Origin 原文内容
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 批改后的内容 
     * @return Replace 批改后的内容
     */
    public String getReplace() {
        return this.Replace;
    }

    /**
     * Set 批改后的内容
     * @param Replace 批改后的内容
     */
    public void setReplace(String Replace) {
        this.Replace = Replace;
    }

    /**
     * Get 点评内容 
     * @return Message 点评内容
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 点评内容
     * @param Message 点评内容
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get array[][]二维数组，原文内容可能存在跨行的句子，会有多组坐标返回

切图区域的4个角点坐标, 是个长度为8的数组

[0,1,2,3,4,5,6,7]

(0,1) 左上角坐标
(2,3) 右上角坐标
(4,5) 右下角坐标
(6,7) 左下角坐标 
     * @return Positions array[][]二维数组，原文内容可能存在跨行的句子，会有多组坐标返回

切图区域的4个角点坐标, 是个长度为8的数组

[0,1,2,3,4,5,6,7]

(0,1) 左上角坐标
(2,3) 右上角坐标
(4,5) 右下角坐标
(6,7) 左下角坐标
     */
    public Positions [] getPositions() {
        return this.Positions;
    }

    /**
     * Set array[][]二维数组，原文内容可能存在跨行的句子，会有多组坐标返回

切图区域的4个角点坐标, 是个长度为8的数组

[0,1,2,3,4,5,6,7]

(0,1) 左上角坐标
(2,3) 右上角坐标
(4,5) 右下角坐标
(6,7) 左下角坐标
     * @param Positions array[][]二维数组，原文内容可能存在跨行的句子，会有多组坐标返回

切图区域的4个角点坐标, 是个长度为8的数组

[0,1,2,3,4,5,6,7]

(0,1) 左上角坐标
(2,3) 右上角坐标
(4,5) 右下角坐标
(6,7) 左下角坐标
     */
    public void setPositions(Positions [] Positions) {
        this.Positions = Positions;
    }

    public MarkEssaySuggestions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MarkEssaySuggestions(MarkEssaySuggestions source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.Replace != null) {
            this.Replace = new String(source.Replace);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Positions != null) {
            this.Positions = new Positions[source.Positions.length];
            for (int i = 0; i < source.Positions.length; i++) {
                this.Positions[i] = new Positions(source.Positions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "Replace", this.Replace);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "Positions.", this.Positions);

    }
}

