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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OcrHitInfo extends AbstractModel {

    /**
    * <p>标识模型命中还是关键词命中</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>命中关键词</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>自定义词库名称</p>
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * <p>位置信息</p>
    */
    @SerializedName("Positions")
    @Expose
    private Positions [] Positions;

    /**
    * <p>命中标签</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get <p>标识模型命中还是关键词命中</p> 
     * @return Type <p>标识模型命中还是关键词命中</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>标识模型命中还是关键词命中</p>
     * @param Type <p>标识模型命中还是关键词命中</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>命中关键词</p> 
     * @return Keyword <p>命中关键词</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>命中关键词</p>
     * @param Keyword <p>命中关键词</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>自定义词库名称</p> 
     * @return LibName <p>自定义词库名称</p>
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set <p>自定义词库名称</p>
     * @param LibName <p>自定义词库名称</p>
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get <p>位置信息</p> 
     * @return Positions <p>位置信息</p>
     */
    public Positions [] getPositions() {
        return this.Positions;
    }

    /**
     * Set <p>位置信息</p>
     * @param Positions <p>位置信息</p>
     */
    public void setPositions(Positions [] Positions) {
        this.Positions = Positions;
    }

    /**
     * Get <p>命中标签</p> 
     * @return Label <p>命中标签</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>命中标签</p>
     * @param Label <p>命中标签</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public OcrHitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OcrHitInfo(OcrHitInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.Positions != null) {
            this.Positions = new Positions[source.Positions.length];
            for (int i = 0; i < source.Positions.length; i++) {
                this.Positions[i] = new Positions(source.Positions[i]);
            }
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamArrayObj(map, prefix + "Positions.", this.Positions);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

