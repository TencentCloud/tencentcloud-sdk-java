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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AITaskResultInfo extends AbstractModel{

    /**
    * 人体识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Body")
    @Expose
    private BodyAIResultInfo [] Body;

    /**
    * 宠物识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pet")
    @Expose
    private PetAIResultInfo [] Pet;

    /**
    * 车辆车牌识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Car")
    @Expose
    private CarAIResultInfo [] Car;

    /**
    * 厨师帽结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChefHat")
    @Expose
    private ChefHatAIResultInfo [] ChefHat;

    /**
    * 厨师服结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChefCloth")
    @Expose
    private ChefClothAIResultInfo [] ChefCloth;

    /**
    * 口罩识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceMask")
    @Expose
    private FaceMaskAIResultInfo [] FaceMask;

    /**
    * 抽烟检测结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Smoking")
    @Expose
    private SmokingAIResultInfo [] Smoking;

    /**
    * 接打电话识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneCall")
    @Expose
    private PhoneCallAIResultInfo [] PhoneCall;

    /**
     * Get 人体识别结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Body 人体识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BodyAIResultInfo [] getBody() {
        return this.Body;
    }

    /**
     * Set 人体识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Body 人体识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBody(BodyAIResultInfo [] Body) {
        this.Body = Body;
    }

    /**
     * Get 宠物识别结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pet 宠物识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PetAIResultInfo [] getPet() {
        return this.Pet;
    }

    /**
     * Set 宠物识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pet 宠物识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPet(PetAIResultInfo [] Pet) {
        this.Pet = Pet;
    }

    /**
     * Get 车辆车牌识别结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Car 车辆车牌识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CarAIResultInfo [] getCar() {
        return this.Car;
    }

    /**
     * Set 车辆车牌识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Car 车辆车牌识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCar(CarAIResultInfo [] Car) {
        this.Car = Car;
    }

    /**
     * Get 厨师帽结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChefHat 厨师帽结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChefHatAIResultInfo [] getChefHat() {
        return this.ChefHat;
    }

    /**
     * Set 厨师帽结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChefHat 厨师帽结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChefHat(ChefHatAIResultInfo [] ChefHat) {
        this.ChefHat = ChefHat;
    }

    /**
     * Get 厨师服结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChefCloth 厨师服结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChefClothAIResultInfo [] getChefCloth() {
        return this.ChefCloth;
    }

    /**
     * Set 厨师服结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChefCloth 厨师服结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChefCloth(ChefClothAIResultInfo [] ChefCloth) {
        this.ChefCloth = ChefCloth;
    }

    /**
     * Get 口罩识别结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceMask 口罩识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceMaskAIResultInfo [] getFaceMask() {
        return this.FaceMask;
    }

    /**
     * Set 口罩识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceMask 口罩识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceMask(FaceMaskAIResultInfo [] FaceMask) {
        this.FaceMask = FaceMask;
    }

    /**
     * Get 抽烟检测结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Smoking 抽烟检测结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmokingAIResultInfo [] getSmoking() {
        return this.Smoking;
    }

    /**
     * Set 抽烟检测结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Smoking 抽烟检测结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmoking(SmokingAIResultInfo [] Smoking) {
        this.Smoking = Smoking;
    }

    /**
     * Get 接打电话识别结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneCall 接打电话识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PhoneCallAIResultInfo [] getPhoneCall() {
        return this.PhoneCall;
    }

    /**
     * Set 接打电话识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneCall 接打电话识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneCall(PhoneCallAIResultInfo [] PhoneCall) {
        this.PhoneCall = PhoneCall;
    }

    public AITaskResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AITaskResultInfo(AITaskResultInfo source) {
        if (source.Body != null) {
            this.Body = new BodyAIResultInfo[source.Body.length];
            for (int i = 0; i < source.Body.length; i++) {
                this.Body[i] = new BodyAIResultInfo(source.Body[i]);
            }
        }
        if (source.Pet != null) {
            this.Pet = new PetAIResultInfo[source.Pet.length];
            for (int i = 0; i < source.Pet.length; i++) {
                this.Pet[i] = new PetAIResultInfo(source.Pet[i]);
            }
        }
        if (source.Car != null) {
            this.Car = new CarAIResultInfo[source.Car.length];
            for (int i = 0; i < source.Car.length; i++) {
                this.Car[i] = new CarAIResultInfo(source.Car[i]);
            }
        }
        if (source.ChefHat != null) {
            this.ChefHat = new ChefHatAIResultInfo[source.ChefHat.length];
            for (int i = 0; i < source.ChefHat.length; i++) {
                this.ChefHat[i] = new ChefHatAIResultInfo(source.ChefHat[i]);
            }
        }
        if (source.ChefCloth != null) {
            this.ChefCloth = new ChefClothAIResultInfo[source.ChefCloth.length];
            for (int i = 0; i < source.ChefCloth.length; i++) {
                this.ChefCloth[i] = new ChefClothAIResultInfo(source.ChefCloth[i]);
            }
        }
        if (source.FaceMask != null) {
            this.FaceMask = new FaceMaskAIResultInfo[source.FaceMask.length];
            for (int i = 0; i < source.FaceMask.length; i++) {
                this.FaceMask[i] = new FaceMaskAIResultInfo(source.FaceMask[i]);
            }
        }
        if (source.Smoking != null) {
            this.Smoking = new SmokingAIResultInfo[source.Smoking.length];
            for (int i = 0; i < source.Smoking.length; i++) {
                this.Smoking[i] = new SmokingAIResultInfo(source.Smoking[i]);
            }
        }
        if (source.PhoneCall != null) {
            this.PhoneCall = new PhoneCallAIResultInfo[source.PhoneCall.length];
            for (int i = 0; i < source.PhoneCall.length; i++) {
                this.PhoneCall[i] = new PhoneCallAIResultInfo(source.PhoneCall[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Body.", this.Body);
        this.setParamArrayObj(map, prefix + "Pet.", this.Pet);
        this.setParamArrayObj(map, prefix + "Car.", this.Car);
        this.setParamArrayObj(map, prefix + "ChefHat.", this.ChefHat);
        this.setParamArrayObj(map, prefix + "ChefCloth.", this.ChefCloth);
        this.setParamArrayObj(map, prefix + "FaceMask.", this.FaceMask);
        this.setParamArrayObj(map, prefix + "Smoking.", this.Smoking);
        this.setParamArrayObj(map, prefix + "PhoneCall.", this.PhoneCall);

    }
}

