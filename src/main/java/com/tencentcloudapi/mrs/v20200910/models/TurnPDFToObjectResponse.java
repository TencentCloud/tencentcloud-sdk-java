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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TurnPDFToObjectResponse extends AbstractModel {

    /**
    * 报告结构化结果
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * 多级分类结果
    */
    @SerializedName("TextTypeList")
    @Expose
    private TextType [] TextTypeList;

    /**
    * 报告结构化结果(体检报告PDF结构化接口返回的 json 内容非常多，建议通过本地代码调用)
    */
    @SerializedName("Block")
    @Expose
    private Block Block;

    /**
    * 是否使用Block字段
    */
    @SerializedName("IsBlock")
    @Expose
    private Boolean IsBlock;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 报告结构化结果 
     * @return Template 报告结构化结果
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set 报告结构化结果
     * @param Template 报告结构化结果
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get 多级分类结果 
     * @return TextTypeList 多级分类结果
     */
    public TextType [] getTextTypeList() {
        return this.TextTypeList;
    }

    /**
     * Set 多级分类结果
     * @param TextTypeList 多级分类结果
     */
    public void setTextTypeList(TextType [] TextTypeList) {
        this.TextTypeList = TextTypeList;
    }

    /**
     * Get 报告结构化结果(体检报告PDF结构化接口返回的 json 内容非常多，建议通过本地代码调用) 
     * @return Block 报告结构化结果(体检报告PDF结构化接口返回的 json 内容非常多，建议通过本地代码调用)
     */
    public Block getBlock() {
        return this.Block;
    }

    /**
     * Set 报告结构化结果(体检报告PDF结构化接口返回的 json 内容非常多，建议通过本地代码调用)
     * @param Block 报告结构化结果(体检报告PDF结构化接口返回的 json 内容非常多，建议通过本地代码调用)
     */
    public void setBlock(Block Block) {
        this.Block = Block;
    }

    /**
     * Get 是否使用Block字段 
     * @return IsBlock 是否使用Block字段
     */
    public Boolean getIsBlock() {
        return this.IsBlock;
    }

    /**
     * Set 是否使用Block字段
     * @param IsBlock 是否使用Block字段
     */
    public void setIsBlock(Boolean IsBlock) {
        this.IsBlock = IsBlock;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public TurnPDFToObjectResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TurnPDFToObjectResponse(TurnPDFToObjectResponse source) {
        if (source.Template != null) {
            this.Template = new Template(source.Template);
        }
        if (source.TextTypeList != null) {
            this.TextTypeList = new TextType[source.TextTypeList.length];
            for (int i = 0; i < source.TextTypeList.length; i++) {
                this.TextTypeList[i] = new TextType(source.TextTypeList[i]);
            }
        }
        if (source.Block != null) {
            this.Block = new Block(source.Block);
        }
        if (source.IsBlock != null) {
            this.IsBlock = new Boolean(source.IsBlock);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamArrayObj(map, prefix + "TextTypeList.", this.TextTypeList);
        this.setParamObj(map, prefix + "Block.", this.Block);
        this.setParamSimple(map, prefix + "IsBlock", this.IsBlock);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

