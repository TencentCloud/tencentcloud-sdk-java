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

public class InternalMedicineAbdomen extends AbstractModel {

    /**
    * 内科腹部小结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private KeyValueItem Text;

    /**
    * 肝脏
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Liver")
    @Expose
    private InternalMedicineAbdomenLiver Liver;

    /**
    * 胆囊
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GallBladder")
    @Expose
    private InternalMedicineAbdomenGallBladder GallBladder;

    /**
    * 胰腺
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pancreas")
    @Expose
    private InternalMedicineAbdomenPancreas Pancreas;

    /**
    * 脾脏
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spleen")
    @Expose
    private InternalMedicineAbdomenSpleen Spleen;

    /**
    * 肾脏
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kidney")
    @Expose
    private InternalMedicineAbdomenKidney Kidney;

    /**
    * 腹部其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Others")
    @Expose
    private KeyValueItem [] Others;

    /**
     * Get 内科腹部小结
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 内科腹部小结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getText() {
        return this.Text;
    }

    /**
     * Set 内科腹部小结
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 内科腹部小结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(KeyValueItem Text) {
        this.Text = Text;
    }

    /**
     * Get 肝脏
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Liver 肝脏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineAbdomenLiver getLiver() {
        return this.Liver;
    }

    /**
     * Set 肝脏
注意：此字段可能返回 null，表示取不到有效值。
     * @param Liver 肝脏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiver(InternalMedicineAbdomenLiver Liver) {
        this.Liver = Liver;
    }

    /**
     * Get 胆囊
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GallBladder 胆囊
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineAbdomenGallBladder getGallBladder() {
        return this.GallBladder;
    }

    /**
     * Set 胆囊
注意：此字段可能返回 null，表示取不到有效值。
     * @param GallBladder 胆囊
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGallBladder(InternalMedicineAbdomenGallBladder GallBladder) {
        this.GallBladder = GallBladder;
    }

    /**
     * Get 胰腺
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pancreas 胰腺
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineAbdomenPancreas getPancreas() {
        return this.Pancreas;
    }

    /**
     * Set 胰腺
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pancreas 胰腺
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPancreas(InternalMedicineAbdomenPancreas Pancreas) {
        this.Pancreas = Pancreas;
    }

    /**
     * Get 脾脏
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spleen 脾脏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineAbdomenSpleen getSpleen() {
        return this.Spleen;
    }

    /**
     * Set 脾脏
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spleen 脾脏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpleen(InternalMedicineAbdomenSpleen Spleen) {
        this.Spleen = Spleen;
    }

    /**
     * Get 肾脏
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kidney 肾脏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineAbdomenKidney getKidney() {
        return this.Kidney;
    }

    /**
     * Set 肾脏
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kidney 肾脏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKidney(InternalMedicineAbdomenKidney Kidney) {
        this.Kidney = Kidney;
    }

    /**
     * Get 腹部其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Others 腹部其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem [] getOthers() {
        return this.Others;
    }

    /**
     * Set 腹部其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param Others 腹部其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOthers(KeyValueItem [] Others) {
        this.Others = Others;
    }

    public InternalMedicineAbdomen() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternalMedicineAbdomen(InternalMedicineAbdomen source) {
        if (source.Text != null) {
            this.Text = new KeyValueItem(source.Text);
        }
        if (source.Liver != null) {
            this.Liver = new InternalMedicineAbdomenLiver(source.Liver);
        }
        if (source.GallBladder != null) {
            this.GallBladder = new InternalMedicineAbdomenGallBladder(source.GallBladder);
        }
        if (source.Pancreas != null) {
            this.Pancreas = new InternalMedicineAbdomenPancreas(source.Pancreas);
        }
        if (source.Spleen != null) {
            this.Spleen = new InternalMedicineAbdomenSpleen(source.Spleen);
        }
        if (source.Kidney != null) {
            this.Kidney = new InternalMedicineAbdomenKidney(source.Kidney);
        }
        if (source.Others != null) {
            this.Others = new KeyValueItem[source.Others.length];
            for (int i = 0; i < source.Others.length; i++) {
                this.Others[i] = new KeyValueItem(source.Others[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "Liver.", this.Liver);
        this.setParamObj(map, prefix + "GallBladder.", this.GallBladder);
        this.setParamObj(map, prefix + "Pancreas.", this.Pancreas);
        this.setParamObj(map, prefix + "Spleen.", this.Spleen);
        this.setParamObj(map, prefix + "Kidney.", this.Kidney);
        this.setParamArrayObj(map, prefix + "Others.", this.Others);

    }
}

