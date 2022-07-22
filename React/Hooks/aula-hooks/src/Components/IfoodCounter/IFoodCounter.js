import React, { useEffect, useState } from "react";
import "../IfoodCounter/IFoodCounter.css";

export default function IFoodCounter() {
  const [value, setValue] = useState(1);
  const [buttonStyle, setButtonStyle] = useState("counter-button-minus-active");

  useEffect(() => {
    alert("Você não pode mais diminuir itens");
  }, [buttonStyle]);

  function down() {
    if (value <= 1) {
      setButtonStyle("counter-button-minus-desactive");
    }

    if (value > 0) {
      setValue(value - 1);
    }
  }

  function up() {
    setValue(value + 1);
  }

  return (
    <div className="countex-wrapper">
      <button onClick={down} className="counter-button-minus-active">
        -
      </button>
      <p>{value}</p>
      <button onClick={up} className="counter-button-plus-active">
        +
      </button>
      <button id="moeda">12,00</button>
    </div>
  );
}
