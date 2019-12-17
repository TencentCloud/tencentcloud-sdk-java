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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Station extends AbstractModel{

    /**
    * StationID
    */
    @SerializedName("CategoryID")
    @Expose
    private String CategoryID;

    /**
    * Station MCCode
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryCode")
    @Expose
    private String CategoryCode;

    /**
    * Category Name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Station的排序值，供参考（返回结果已按其升序）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
    * station图片集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImagePathMap")
    @Expose
    private ImagePath [] ImagePathMap;

    /**
     * Get StationID 
     * @return CategoryID StationID
     */
    public String getCategoryID() {
        return this.CategoryID;
    }

    /**
     * Set StationID
     * @param CategoryID StationID
     */
    public void setCategoryID(String CategoryID) {
        this.CategoryID = CategoryID;
    }

    /**
     * Get Station MCCode
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryCode Station MCCode
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoryCode() {
        return this.CategoryCode;
    }

    /**
     * Set Station MCCode
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryCode Station MCCode
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryCode(String CategoryCode) {
        this.CategoryCode = CategoryCode;
    }

    /**
     * Get Category Name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name Category Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Category Name
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name Category Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Station的排序值，供参考（返回结果已按其升序）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rank Station的排序值，供参考（返回结果已按其升序）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set Station的排序值，供参考（返回结果已按其升序）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rank Station的排序值，供参考（返回结果已按其升序）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    /**
     * Get station图片集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImagePathMap station图片集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImagePath [] getImagePathMap() {
        return this.ImagePathMap;
    }

    /**
     * Set station图片集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImagePathMap station图片集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImagePathMap(ImagePath [] ImagePathMap) {
        this.ImagePathMap = ImagePathMap;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamSimple(map, prefix + "CategoryCode", this.CategoryCode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rank", this.Rank);
        this.setParamArrayObj(map, prefix + "ImagePathMap.", this.ImagePathMap);

    }
}

