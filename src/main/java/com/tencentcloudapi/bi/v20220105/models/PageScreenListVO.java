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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PageScreenListVO extends AbstractModel {

    /**
    * 图片导出类型。base64；url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PicType")
    @Expose
    private String PicType;

    /**
    * 图片列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private PageScreenVO [] List;

    /**
    * 异步事务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * 事务状态
1: 处理中; 2: 处理成功; 3 处理失败(错误内容见外层Msg)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranStatus")
    @Expose
    private Long TranStatus;

    /**
     * Get 图片导出类型。base64；url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PicType 图片导出类型。base64；url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPicType() {
        return this.PicType;
    }

    /**
     * Set 图片导出类型。base64；url
注意：此字段可能返回 null，表示取不到有效值。
     * @param PicType 图片导出类型。base64；url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPicType(String PicType) {
        this.PicType = PicType;
    }

    /**
     * Get 图片列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 图片列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PageScreenVO [] getList() {
        return this.List;
    }

    /**
     * Set 图片列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 图片列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(PageScreenVO [] List) {
        this.List = List;
    }

    /**
     * Get 异步事务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranId 异步事务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set 异步事务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranId 异步事务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get 事务状态
1: 处理中; 2: 处理成功; 3 处理失败(错误内容见外层Msg)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranStatus 事务状态
1: 处理中; 2: 处理成功; 3 处理失败(错误内容见外层Msg)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTranStatus() {
        return this.TranStatus;
    }

    /**
     * Set 事务状态
1: 处理中; 2: 处理成功; 3 处理失败(错误内容见外层Msg)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranStatus 事务状态
1: 处理中; 2: 处理成功; 3 处理失败(错误内容见外层Msg)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranStatus(Long TranStatus) {
        this.TranStatus = TranStatus;
    }

    public PageScreenListVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageScreenListVO(PageScreenListVO source) {
        if (source.PicType != null) {
            this.PicType = new String(source.PicType);
        }
        if (source.List != null) {
            this.List = new PageScreenVO[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new PageScreenVO(source.List[i]);
            }
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.TranStatus != null) {
            this.TranStatus = new Long(source.TranStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PicType", this.PicType);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);

    }
}

